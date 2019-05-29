public class Priorites {

	public static void main(String[] args) {
		// Main
		
		Formateur leFormateur = new Formateur();
		Personne leFormateur2 = new Formateur();
		
		leFormateur2.setPrenom("Toto");
		
		System.out.println(leFormateur);
		System.out.println(leFormateur2);
		
		leFormateur.salut();
		leFormateur.sePresenter();
		leFormateur2.sePresenter();
		
		/*if (leFormateur2 instanceof Formateur) {
			Formateur demo = (Formateur)leFormateur2;
			demo.salut();
		}*/
		
		((Formateur) leFormateur2).salut();
		leFormateur2.sePresenter();
		
		Personne romain = new Stagiaire();
		
		if (romain instanceof Formateur) {
			((Formateur) romain).salut();
		} else {
			System.out.println("Romain, reste à ta place, stp.");
		}
		
		Presentable monPresentable = new Stagiaire();
		monPresentable.sePresenter("Robert");
		
		Presentable monPresentable2 = new Formateur();
		
		if (monPresentable2 instanceof Formateur) {
			((Formateur) monPresentable2).setPrenom("Jean-Jacques");
			monPresentable2.sePresenter("Hildegarde");
			
			System.out.println("Compteur non statique: " + romain.getCompteur1());
			System.out.println("Compteur statique: " + Personne.getCompteur2());

		}
		
	}

}
