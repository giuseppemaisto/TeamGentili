package it.accenture.ecommerce.interfaces;
import it.accenture.ecommerce.classi.Prodotto;

import java.util.List;
import jakarta.ejb.Local;

@Local
public interface IProdottoDAOLocal {
	
	public Prodotto prendiProdotto(Integer prodottoId);
	public List<Prodotto> listaProdotti();
}
