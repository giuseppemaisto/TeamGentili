package it.accenture.ecommerce.classi.DAO;

import it.accenture.ecommerce.classi.Utente;

public interface IUtenteDao {
    void registrazione(Utente utente);

    boolean logout();

	boolean login(Utente utente);
}