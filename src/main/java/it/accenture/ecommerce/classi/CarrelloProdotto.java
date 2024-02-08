package it.accenture.ecommerce.classi;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="carrello_prodotti")
public class CarrelloProdotto implements Serializable{
	
	public CarrelloProdotto() {
		super();
	}
	public CarrelloProdotto(Integer id, Carrello carrello, Prodotto prodotto, LocalDateTime dataAggiunta) {
		super();
		this.id = id;
		this.carrello = carrello;
		this.prodotto = prodotto;
		this.dataAggiunta = dataAggiunta;
	}
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Carrello carrello;
	private Prodotto prodotto;
	private LocalDateTime dataAggiunta;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public Integer getId() {
		return id;
	}
	@ManyToOne
	@JoinColumn(name="carrelloId")
	public Carrello getCarrello() {
		return carrello;
	}
	@ManyToOne
	@JoinColumn(name="prodottoId")
	public Prodotto getProdotto() {
		return prodotto;
	}
	@Column(name="data_aggiunta")
	public LocalDateTime getDataAggiunta() {
		return dataAggiunta;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	public void setDataAggiunta(LocalDateTime dataAggiunta) {
		this.dataAggiunta = dataAggiunta;
	}
}