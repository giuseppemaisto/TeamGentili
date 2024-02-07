package it.accenture.ecommerce.servlet;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.accenture.ecommerce.classi.Chiavi;
import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.interfaces.IUtenteDAOLocal;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private IUtenteDAOLocal utenteDao;

	public ServletLogin() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// lista prodotti da inserire successivamente

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String psw = request.getParameter("psw");
		Utente utente = new Utente();
		utente.setEmail(email);
		utente.setPsw(psw);
		boolean result = utenteDao.login(utente);
		if (result) {
			request.getSession(true).setAttribute(Chiavi.CHIAVE_LOGIN, email);
			request.getRequestDispatcher("/ServletProdotto").include(request, response);
			
			request.getRequestDispatcher("prodotti.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("registrazione.jsp").forward(request, response);
		}
	}

}
