package it.accenture.ecommerce.interfaces;

import java.util.List;

import it.accenture.ecommerce.classi.Prodotto;
import jakarta.ejb.Local;
@Local
public interface IProdottoDAOLocal {
	
	public Prodotto prendiProdotto(Integer prodottoId);
	public List<Prodotto> listaProdotti();
}
