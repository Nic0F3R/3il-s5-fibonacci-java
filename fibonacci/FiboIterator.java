package fibonacci;

import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {

	// Borne maximale
	private int borne;
	
	// Termes précédent et actuel
	private int precedent, actuel;
	
	// Rang de la suite
	private int rang;
	
	/**
	 * @param pfBorne la borne de la suite
	 */
	public FiboIterator(int pfBorne) {
		this.borne = pfBorne;
		this.precedent = 1;
		this.actuel = 1;
		this.rang = 0;
	}
	
	@Override
	public boolean hasNext() {
		return this.rang < this.borne;
	}

	@Override
	public Integer next() {
		
		int res;
		
		if(rang == 0 || rang == 1) {
			res = 1;
		} else {
			res = this.precedent + actuel;
			this.precedent = this.actuel;
			this.actuel = res;
		}
		
		this.rang++;
		
		return res;
		
	}
	
}
