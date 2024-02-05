package it.accenture.ecommerce.model;

import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.classi.DAO.IUtenteDao;
import it.accenture.ecommerce.interfaces.IECommerceMangaDAO;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Session Bean implementation class ECommerceManga
 */
@Stateless
@LocalBean
public class ECommerceManga implements IECommerceMangaDAO, IUtenteDao {

	@PersistenceContext(unitName = "ecommerce_manga")
	EntityManager db;
	
	
    /**
     * Default constructor. 
     */
    public ECommerceManga() {
        // TODO Auto-generated constructor stub
    }


	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void registrazione(Utente utente) {
		db.persist(utente);
		
	}

}
