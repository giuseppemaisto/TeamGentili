package it.accenture.ecommerce.classi;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "utente")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	private Carrello carrello; 

	public Utente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utente(String nome, String cognome, String email, String indirizzo, String numero_telefono,
			String psw) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.indirizzo = indirizzo;
		this.numero_telefono = numero_telefono;
		this.psw = psw;
	}
	// Getter e setter per gli attributi

	private Integer utenteId;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "utenteId")
	public Integer getUtenteId() {
		return utenteId;
	}

	public void setUtenteId(Integer utenteId) {
		this.utenteId = utenteId;
	}

	private String nome;

	@Column(name = "nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String cognome;

	@Column(name = "cognome")
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	private String email;

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String numero_telefono;

	@Column(name = "numero_telefono")
	public String getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

	private String indirizzo;

	@Column(name = "indirizzo")
	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	private String psw;

	@Column(name = "psw")
	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	@OneToOne (mappedBy = "utente")
	public Carrello getCarrello() {
		return carrello;
	}

	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}
	
	
		
	}

