package it.accenture.ecommerce.classi;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "prodotto")
public class Prodotto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer prodottoId;
	private String nomeProdotto;
	private String descrizione;
	private Double prezzo;
	private String categoria;
	private String immagine;

	public Prodotto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prodotto(String nomeProdotto, String descrizione, Double prezzo, String categoria, String immagine) {
		super();
		this.nomeProdotto = nomeProdotto;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.categoria = categoria;
		this.immagine = immagine;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public Integer getProdottoId() {
		return prodottoId;
	}

	@Column(name = "nome_prodotto")
	public String getNomeProdotto() {
		return nomeProdotto;
	}

	@Column(name = "descrizione")
	public String getDescrizione() {
		return descrizione;
	}

	@Column(name = "prezzo")
	public Double getPrezzo() {
		return prezzo;
	}

	@Column(name = "categoria")
	public String getCategoria() {
		return categoria;
	}

	@Column(name = "immagine")
	public String getImmagine() {
		return immagine;
	}

	public void setProdottoId(Integer prodottoId) {
		this.prodottoId = prodottoId;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	@Override
	public int hashCode() {
		return Objects.hash(prodottoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotto other = (Prodotto) obj;
		return Objects.equals(prodottoId, other.prodottoId);
	}

}
