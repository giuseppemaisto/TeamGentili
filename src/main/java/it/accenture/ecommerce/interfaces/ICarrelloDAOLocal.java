package it.accenture.ecommerce.interfaces;
import it.accenture.ecommerce.classi.Prodotto;
import it.accenture.ecommerce.classi.Utente;


import java.util.List;
import jakarta.ejb.Local;

@Local
public interface ICarrelloDAOLocal {
		
	public void aggiungi(Utente u,Prodotto p);
	public void rimuovi(Utente u,Prodotto p);
	public void svuota(Utente u);
	public List<Prodotto> prendiTutto(Utente u);
	
}
