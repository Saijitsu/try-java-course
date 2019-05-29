public abstract class Personne {

	private int compteur1 = 0;
	private static int compteur2 = 0; //Sera accessible de n'importe ou dans l'application
	public static final double PI = 3.14; 
	// static : récupérable via Personne.PI, appartient aux personnes en générales.
	// final: non modifiable = constante

	public Personne() {
		setCompteur1(getCompteur1() + 1); // => compteur1++
		setCompteur2(getCompteur2() + 1);  // => compteur2++
	}

	private String prenom = "Christopher";

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Formateur [prenom=" + prenom + "]";
	}

	public abstract void sePresenter();

	public int getCompteur1() {
		return compteur1;
	}

	public void setCompteur1(int compteur1) {
		this.compteur1 = compteur1;
	}

	public static int getCompteur2() {
		return compteur2;
	}

	public static void setCompteur2(int compteur2) {
		Personne.compteur2 = compteur2;
	}

}
