public class Stagiaire extends Personne implements Presentable {

	@Override
	public void sePresenter() {
		System.out.println("Coucou, je suis le stagiaire" + getPrenom());
	}

	@Override
	public void sePresenter(String nom) {
		// TODO Auto-generated method stub
		System.out.println("M'en fous, c'est la dernière journée !");
	}
	
}
