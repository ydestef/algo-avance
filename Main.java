import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Arbre tree = new Arbre(null, 0,null);
		
		tree = Arbre.Inserer(21, tree);
		tree = Arbre.Inserer(9, tree);
		tree = Arbre.Inserer(12, tree);
		tree = Arbre.Inserer(34, tree);
		tree = Arbre.Inserer(36, tree);
		tree = Arbre.Inserer(35, tree);
	}
}
