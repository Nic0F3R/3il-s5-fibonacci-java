package testfibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import fibonacci.Fibonacci;
import junit.framework.TestCase;

public class TestFibonacci {

	@Test
	void testFibonacci1() {
		Fibonacci fib1 = new Fibonacci(1);
		assertEquals("[1=1]", fib1.toString());
	}
	
	@Test
	void testFibonacci2() {
		Fibonacci fib1 = new Fibonacci(2);
		assertEquals("[1=1;2=1]", fib1.toString());
	}
	
}
