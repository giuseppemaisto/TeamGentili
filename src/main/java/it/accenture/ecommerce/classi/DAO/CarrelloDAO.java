package it.accenture.ecommerce.classi.DAO;
import java.util.ArrayList;
import java.util.List;

import it.accenture.ecommerce.classi.Carrello;
import it.accenture.ecommerce.classi.CarrelloProdotto;
import it.accenture.ecommerce.classi.Prodotto;
import it.accenture.ecommerce.classi.Utente;
import it.accenture.ecommerce.interfaces.ICarrelloDAOLocal;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
@LocalBean
public class CarrelloDAO implements ICarrelloDAOLocal {

	@PersistenceContext(unitName = "ecommerce_manga")
	EntityManager db;

	@Override
	public void aggiungi(Utente u, Prodotto p) {
		Carrello c = u.getCarrello();
		c.aggiungiProdotto(p);
		db.merge(c);
	}

	@Override
	public void rimuovi(Utente u, Prodotto p) {
		Carrello c = u.getCarrello();
		c.rimuoviProdotto(p);
		db.merge(c);
		
	}

	@Override
	public void svuota(Utente u) {
		Carrello c = u.getCarrello();
		c.clear();
		db.merge(c);
	}

	@Override
	public List<CarrelloProdotto> prendiTutto(Utente u) {
		Carrello c = u.getCarrello();
		return c.getCarrelloProdotti();
	}

	@Override
	public void creaCarrello(Carrello carrello) {
		db.persist(carrello);
		
	}
	

}