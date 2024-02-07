package it.accenture.ecommerce.classi.DAO;

import java.util.List;

import it.accenture.ecommerce.classi.Prodotto;
import it.accenture.ecommerce.interfaces.IProdottoDAOLocal;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

/**
 * Session Bean implementation class ProdottoDAO
 */
@Stateless
@LocalBean
public class ProdottoDAO implements IProdottoDAOLocal {

	@PersistenceContext(unitName = "ecommerce_manga")
	EntityManager db;
	
    public ProdottoDAO() {
        // TODO Auto-generated constructor stub
    }
    
    public Prodotto prendiProdotto(Integer prodottoId) {
    	Prodotto p = db.find(Prodotto.class, prodottoId);
	    return p;
    }

	@Override
	public List<Prodotto> listaProdotti() {
		TypedQuery<Prodotto> query = db.createQuery("SELECT p FROM Prodotto p",Prodotto.class);
		List<Prodotto> lista = query.getResultList();
		return lista;
	}


}
