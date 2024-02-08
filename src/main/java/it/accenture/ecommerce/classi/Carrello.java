package it.accenture.ecommerce.classi;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "carrello")
public class Carrello implements Serializable {

	private static final long serialVersionUID = 1L;

	public Carrello() {

	}

	private Integer carrelloId;

	private List<CarrelloProdotto> carrelloProdotti;
	private Utente utente;

	@OneToOne
	@JoinColumn(name="utenteId")
	public Utente getUtente() {
		return utente;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "carrelloId")
	public Integer getCarrelloId() {
		return carrelloId;
	}

	@OneToMany(mappedBy = "carrello")
	public List<CarrelloProdotto> getCarrelloProdotti() {
		return carrelloProdotti;
	}

	public void setCarrelloId(Integer carrelloId) {
		this.carrelloId = carrelloId;
	}


	public void setCarrelloProdotti(List<CarrelloProdotto> carrelloProdotti) {
		this.carrelloProdotti = carrelloProdotti;
	}

	public void aggiungiProdotto(Prodotto p) {
		if(this.carrelloProdotti==null) {
			this.carrelloProdotti=new ArrayList<>();
		}
		CarrelloProdotto c = new CarrelloProdotto();
		c.setCarrello(this);
		c.setProdotto(p);
		c.setDataAggiunta(LocalDateTime.now());
		this.carrelloProdotti.add(c);
	}

	public CarrelloProdotto rimuoviProdotto(Prodotto p) {
		if(this.carrelloProdotti==null) {
			this.carrelloProdotti=new ArrayList<>();
			return null;
		}
		CarrelloProdotto tmp=null;
		for(CarrelloProdotto c:this.carrelloProdotti) {
			if(c.getCarrello().equals(this)&&c.getProdotto().equals(p)) {
				tmp = c;
			}
		}
		this.carrelloProdotti.remove(tmp);
		return tmp;
	}

	public void clear() {
		if (carrelloProdotti == null) {
			carrelloProdotti = new ArrayList<CarrelloProdotto>();
			return;
		}
		carrelloProdotti.clear();
	}

	public Carrello(Integer carrelloId, Utente utente) {

		this.carrelloId = carrelloId;
		this.utente = utente;

	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	

}
