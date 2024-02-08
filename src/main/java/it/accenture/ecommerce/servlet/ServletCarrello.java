package it.accenture.ecommerce.servlet;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import it.accenture.ecommerce.classi.Carrello;
import it.accenture.ecommerce.classi.CarrelloProdotto;
import it.accenture.ecommerce.classi.Chiavi;
import it.accenture.ecommerce.classi.Prodotto;
import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.interfaces.ICarrelloDAOLocal;
import it.accenture.ecommerce.interfaces.IProdottoDAOLocal;
import it.accenture.ecommerce.interfaces.IUtenteDAOLocal;

@WebServlet("/ServletCarrello")
public class ServletCarrello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	IProdottoDAOLocal prodottoService;
	@EJB
	ICarrelloDAOLocal carrelloService;
	@EJB
	IUtenteDAOLocal utenteService;
	
    public ServletCarrello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session == null) {
			request.getRequestDispatcher("prodotti.jsp").forward(request, response);
			return;
		}
		String email = (String) session.getAttribute(Chiavi.CHIAVE_LOGIN);
		Utente u= utenteService.prendiUtente(email);
		Carrello carrelloUtente = u.getCarrello();
		List<CarrelloProdotto> prodottiNelCarrello = carrelloUtente.getCarrelloProdotti();
		List<Prodotto> listaProdottiNelCarrello = new ArrayList<Prodotto>();
		for (CarrelloProdotto prodotto : prodottiNelCarrello) {
			listaProdottiNelCarrello.add(prodotto.getProdotto());
		}
		request.setAttribute(Chiavi.CHIAVE_CARRELLO, listaProdottiNelCarrello);
		request.getRequestDispatcher("carrello.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
