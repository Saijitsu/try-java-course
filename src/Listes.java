import java.util.*;

public class Listes {

	public static void main(String[] args) {
		
		System.out.println("\n\t ARRAYLIST");
		ArrayList<String> personnages = new ArrayList<>();
		personnages.add("Falbala");
		personnages.add("Panoramix");
		personnages.add("Astérix");
		personnages.add("Obélix");
		personnages.add("Idéfix");
		
		personnages.remove(1);
		
		parcoursListe(personnages);
		
		System.out.println("GET");
		System.out.println(personnages.get(3));
		
		Collections.sort(personnages);
		// Alphabetical sort
		System.out.println("\n\t APHABETICAL SORT");
		parcoursListe(personnages);
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Falbala");
		hashSet.add("Panoramix");
		hashSet.add("Astérix");
		hashSet.add("Obélix");
		hashSet.add("Obélix");
		hashSet.add("Obélix");
		hashSet.add("Obélix");
		hashSet.add("Obélix");
		hashSet.add("Obélix");
		hashSet.add("Idéfix");
		
		System.out.println("\n\t HASHSET");
		parcoursListe(hashSet);
		
		System.out.println("\n\t TREE");
		TreeSet<String> treeSet = new TreeSet<>(personnages);
		parcoursListe(treeSet);
		
	}

	private static void parcoursListe(Iterable<String> personnages) {
		for (String personnage : personnages) {
			System.out.println(personnage);
		}
	}
	
}
