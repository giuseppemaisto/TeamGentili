package it.accenture.ecommerce.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.classi.DAO.IUtenteDao;
import it.accenture.ecommerce.classi.DAO.UtenteDao;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    @EJB
	private IUtenteDao utenteDao;

    public ServletLogin() {
        super();
        utenteDao = new UtenteDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//lista prodotti da inserire successivamente
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String numero_telefono = request.getParameter("numero_telefono");
		String indirizzo = request.getParameter("indirizzo");
		String psw = request.getParameter("psw");
		Utente utente = new Utente(null,nome, cognome, email, numero_telefono, indirizzo, psw);
		boolean result = utenteDao.login(utente);
		if(result=true) {
		request.getRequestDispatcher("prodotti.jsp").forward(request, response);}
		else {	request.getRequestDispatcher("registrazione.jsp").forward(request, response);}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
