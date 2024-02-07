package it.accenture.ecommerce.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import it.accenture.ecommerce.classi.Carrello;
import it.accenture.ecommerce.classi.Chiavi;
import it.accenture.ecommerce.classi.Prodotto;
import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.classi.DAO.CarrelloDAO;
import it.accenture.ecommerce.interfaces.ICarrelloDAOLocal;
import it.accenture.ecommerce.interfaces.IProdottoDAOLocal;
import it.accenture.ecommerce.interfaces.IUtenteDAOLocal;

@WebServlet ("/ServletProdotto")
public class ServletProdotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	ICarrelloDAOLocal carrelloService;
	@EJB
	IUtenteDAOLocal utenteService;
	@EJB
	IProdottoDAOLocal prodottoService;
	

    public ServletProdotto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		String email = (String) session.getAttribute(Chiavi.CHIAVE_LOGIN);
		Utente u= utenteService.prendiUtente(email);
		List<Prodotto> p = prodottoService.listaProdotti();
		request.setAttribute(Chiavi.CHIAVE_LISTA_PRODOTTI, p);
		request.getRequestDispatcher("prodotti.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
