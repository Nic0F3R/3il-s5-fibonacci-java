package testfibonacci;

import org.junit.jupiter.api.Test;

import fibonacci.Fibonacci;
import junit.framework.TestCase;

public class TestFibonacci extends TestCase {

	@Test
	void testFibonacci1() {
		Fibonacci fib1 = new Fibonacci(1);
		assertEquals("[1=1]", fib1.toString());
	}
	
}
