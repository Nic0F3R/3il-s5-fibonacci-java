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
	
	@Test
	void testFibonacci3() {
		Fibonacci fib1 = new Fibonacci(3);
		assertEquals("[1=1;2=1;3=2]", fib1.toString());
	}
	
	@Test
	void testFibonacci4() {
		Fibonacci fib1 = new Fibonacci(4);
		assertEquals("[1=1;2=1;3=2;4=3]", fib1.toString());
	}
	
	@Test
	void testFibonacci5() {
		Fibonacci fib1 = new Fibonacci(5);
		assertEquals("[1=1;2=1;3=2;4=3;5=5]", fib1.toString());
	}
	
}
