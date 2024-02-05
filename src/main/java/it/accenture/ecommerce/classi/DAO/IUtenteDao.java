package it.accenture.ecommerce.classi.DAO;

import it.accenture.ecommerce.classi.Utente;

public interface IUtenteDao {
	
	
	public void login();
	public boolean logout();
	public void registrazione(Utente utente);
	
}
