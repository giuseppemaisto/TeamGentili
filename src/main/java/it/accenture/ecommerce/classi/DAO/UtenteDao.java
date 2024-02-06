package it.accenture.ecommerce.classi.DAO;
import org.jasypt.util.password.StrongPasswordEncryptor;
import it.accenture.ecommerce.classi.Utente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UtenteDao implements IUtenteDao {

	@PersistenceContext(unitName = "ecommerce_manga")
	EntityManager db;

	@Override
	public void registrazione(Utente utente) {
//		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
//		String passwordCriptata = encryptor.encryptPassword(utente.getPsw());
//		utente.setPsw(passwordCriptata);
		db.persist(utente);
	}

	@Override
	public boolean login(Utente utente) {
		 if(db.contains(utente)) {
			 String sql="Select psw from utente where email=?";
			 if(utente.getPsw()==sql);
			 return true;}
		 else {return false;}
		 }

	@Override
	public boolean logout() {
		// Implementazione del metodo di logout
		return false;
	}
}