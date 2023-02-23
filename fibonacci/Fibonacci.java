package fibonacci;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {

	private FiboIterator iterateur;
	
	public Fibonacci(Integer pfBorne) {
		this.iterateur = new FiboIterator(pfBorne);
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return this.iterateur;
	}
	
	/**
	 * Permettra de retourner une chaîne au format "[1=1;2=1;3=2]"
	 */
	@Override
	public String toString() {
		int nbElt = 1;
		String res = "[";
		
		//res += nbElt + "=1;";
		//nbElt++;
		
		for (Iterator<Integer> iterateur = this.iterator(); iterateur.hasNext();) {
			res += nbElt + "=" + iterateur.next() + ";";
			nbElt++;
		}
		
		// Retrait du dernier ";"
		res = res.substring(0, res.length() - 1);
		
		// Ajout du "]" à la fin
		res += "]";
		
		return res;
	}
	
}
