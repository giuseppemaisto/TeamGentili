package it.accenture.ecommerce.interfaces;

import it.accenture.ecommerce.classi.Utente;
import jakarta.ejb.*;

@Local
public interface IUtenteDAOLocal {
    
	public void registrazione(Utente utente);

	public boolean logout();

	public boolean login(Utente utente);
	
	public void effettuaOrdine();
	
	public void visualizzaOrdine();

	public Utente prendiUtente(Integer utenteId);
	public Utente prendiUtente(String email);
	
}

