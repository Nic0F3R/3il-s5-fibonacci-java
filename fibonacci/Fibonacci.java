package fibonacci;

public class Fibonacci {

	private FiboIterator iterateur;
	
	public Fibonacci(Integer pfBorne) {
		this.iterateur = new FiboIterator(pfBorne);
	}
	
}
