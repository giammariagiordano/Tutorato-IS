package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import example.Operation;

class TestOperation {

	@Test
	void testSommaOrRaddoppiaPari() {
		Operation op = new Operation();
		int number = 10;
		assertEquals(20,op.sommaOrRaddoppia(number));
	}
	@Test
	void testSommaOrRaddoppiaDispari() {
		Operation op = new Operation();
		int number = 5;
		assertEquals(10,op.sommaOrRaddoppia(number));
	}

}
