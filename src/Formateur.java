import java.io.Serializable;

public class Formateur extends Personne implements Presentable, Serializable {

	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		System.out.println("Je m'appelle " + getPrenom());
	}

	@Override
	public String toString() {
		return "Personne [getPrenom()=" + getPrenom() + "]";
	}
	
	public void salut() {
		System.out.println("Salut les gars (mais aussi les filles)");
	}

	@Override
	public void sePresenter(String nom) {
		System.out.println("Salut " + nom + ", moi c'est " + getPrenom());
	}
	
}
