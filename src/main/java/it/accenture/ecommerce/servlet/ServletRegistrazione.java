package it.accenture.ecommerce.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.interfaces.IUtenteDAOLocal;

@WebServlet("/ServletRegistrazione")
public class ServletRegistrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private IUtenteDAOLocal utenteDao;

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

		Utente utente = new Utente(null, nome, cognome, email, numero_telefono, indirizzo, psw);
		utenteDao.registrazione(utente);

		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
}
