package fibonacci;

public class Fibonacci {

	private FiboIterator iterateur;
	
	public Fibonacci(Integer pfBorne) {
		this.iterateur = new FiboIterator(pfBorne);
	}
	
	/**
	 * Permettra de retourner une chaîne au format "[1=1;2=1;3=2]"
	 */
	@Override
	public String toString() {
		return "[1=1]";
	}
	
}
