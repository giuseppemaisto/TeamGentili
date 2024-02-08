package it.accenture.ecommerce.classi.DAO;

import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.interfaces.IUtenteDAOLocal;
import jakarta.ejb.*;
import jakarta.persistence.*;

@Stateless
@LocalBean
public class UtenteDAO implements IUtenteDAOLocal {
	
	@PersistenceContext(unitName = "ecommerce_manga")
	EntityManager db;

    public UtenteDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void registrazione(Utente utente) {
//		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
//		String passwordCriptata = encryptor.encryptPassword(utente.getPsw());
//		utente.setPsw(passwordCriptata);
		db.persist(utente);
		
	}

	@Override
	public boolean login(Utente utente, String psw) {
		TypedQuery<String> query = db.createQuery("Select u.psw from Utente u where u.email=?1", String.class);
		query.setParameter(1, utente.getEmail());
		String password = query.getSingleResult();
		//il controllo mi restituisce un booleano, quindi non c'è bisogno di scrivere il codice dell'if
		return (password != null && !password.isEmpty() && password.equals(psw));
//		if (utenteDB != null && !utenteDB.isEmpty()) {
//			//ENTRO CHE SONO REGISTRATO (email trovata)
//			return true;
//		} else {
//			return false;
//		}
	}
	
	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void effettuaOrdine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visualizzaOrdine() {
		// TODO Auto-generated method stub
		
	}
	
	public Utente prendiUtente(Integer utenteId) {
		return db.find(Utente.class, utenteId);
	    }

	@Override
	public Utente prendiUtente(String email) {
		TypedQuery<Utente> query = db.createQuery("Select u from Utente u where u.email=?1", Utente.class);
		query.setParameter(1, email);
		Utente utenteDB = query.getSingleResult();
		return utenteDB;
	}

}
