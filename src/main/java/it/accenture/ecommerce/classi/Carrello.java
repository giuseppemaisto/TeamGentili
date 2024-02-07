package it.accenture.ecommerce.classi;

import java.io.Serializable;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
@Table(name = "carrello")
public class Carrello implements Serializable {

	private static final long serialVersionUID = 1L;

	public Carrello() {

	}

	private Integer carrelloId;

	private ArrayList<Prodotto> carrelloProdotti;
	private Utente utente;

//	@OneToOne(mappedBy = "carrello")
	public Utente getUtente() {
		return utente;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "carrelloID")
	public Integer getCarrelloId() {
		return carrelloId;
	}

//	@OneToMany(mappedBy = "carrello")
	public ArrayList<Prodotto> getCarrelloProdotti() {
		return carrelloProdotti;
	}

	public void setCarrelloId(Integer carrelloId) {
		this.carrelloId = carrelloId;
	}

//	@OneToMany(mappedBy = "carrello")
	public void setCarrelloProdotti(ArrayList<Prodotto> carrelloProdotti) {
		this.carrelloProdotti = carrelloProdotti;
	}

	public void aggiungiProdotto(Prodotto p) {
		if (carrelloProdotti == null) {
			carrelloProdotti = new ArrayList<Prodotto>();
		}
		carrelloProdotti.add(p);
	}

	public void rimuoviProdotto(Prodotto p) {
		if (carrelloProdotti == null) {
			carrelloProdotti = new ArrayList<Prodotto>();
			return;
		}
		carrelloProdotti.remove(p);
	}

	public void clear() {
		if (carrelloProdotti == null) {
			carrelloProdotti = new ArrayList<Prodotto>();
			return;
		}
		carrelloProdotti.clear();
	}

	public Carrello(Integer carrelloId, Utente utente) {

		this.carrelloId = carrelloId;
		this.utente = utente;

	}

}
