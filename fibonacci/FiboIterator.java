package fibonacci;

public class FiboIterator {

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
}
