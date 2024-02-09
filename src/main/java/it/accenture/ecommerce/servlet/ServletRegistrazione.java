package it.accenture.ecommerce.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.accenture.ecommerce.classi.Carrello;
import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.classi.DAO.CarrelloDAO;
import it.accenture.ecommerce.interfaces.ICarrelloDAOLocal;
import it.accenture.ecommerce.interfaces.IUtenteDAOLocal;

@WebServlet("/ServletRegistrazione")
public class ServletRegistrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private IUtenteDAOLocal utenteDao;
	@EJB
	private ICarrelloDAOLocal carrelloDao;

	public ServletRegistrazione() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String numero_telefono = request.getParameter("numero_telefono");
		String indirizzo = request.getParameter("indirizzo");
		String psw = request.getParameter("psw");

		Utente utente = new Utente(nome, cognome, email, numero_telefono, indirizzo, psw);
		utenteDao.registrazione(utente);
		Carrello carrello = new Carrello();
		carrello.setUtente(utente);
		carrelloDao.creaCarrello(carrello);
		utente.setCarrello(carrello);
		utenteDao.aggiornaUtente(utente);

		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		doPost(req, resp);
	}
	
	
}
