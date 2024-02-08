package it.accenture.ecommerce.interfaces;
import it.accenture.ecommerce.classi.Carrello;
import it.accenture.ecommerce.classi.CarrelloProdotto;
import it.accenture.ecommerce.classi.Prodotto;
import it.accenture.ecommerce.classi.Utente;

import java.util.ArrayList;
import java.util.List;
import jakarta.ejb.Local;

@Local
public interface ICarrelloDAOLocal {
		
	public void creaCarrello(Carrello carrello);
	public void aggiungi(Utente u,Prodotto p);
	public void rimuovi(Utente u,Prodotto p);
	public void svuota(Utente u);
	public List<CarrelloProdotto> prendiTutto(Utente u);
	
}
