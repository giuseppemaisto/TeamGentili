package it.accenture.ecommerce.model;

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
public class ECommerceManga implements IECommerceMangaDAO {

	@PersistenceContext(unitName = "ecommerce_manga")
	EntityManager db;
	
	
    /**
     * Default constructor. 
     */
    public ECommerceManga() {
        // TODO Auto-generated constructor stub
    }

}
