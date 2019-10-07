package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import example.Operation;

class TestOperation {

	@Test
	void testSommaPositivi() {
		Operation op = new Operation();
		assertEquals(4, op.somma(2, 2));
	}
	
	@Test
	void testSommaNegativi() {
		Operation op = new Operation();
		assertEquals(-4, op.somma(-2, -2));
	} 
	
	@Test
	void testSommaZero() {
		Operation op = new Operation();
		assertEquals(4, op.somma(0, 4));
	}
	
	@Test
	void testSommaPosNeg() {
		Operation op = new Operation();
		assertEquals(0, op.somma(2, -2));
	}
	
	@Test
	void testSommaNegPos() {
		Operation op = new Operation();
		assertEquals(-1, op.somma(-3, 2));
	}

	@Test
	void testRaddoppiaPos() {
		Operation op = new Operation();
		assertEquals(4, op.raddoppia(2));
	}
	
	@Test
	void testRaddoppiaNeg() {
		Operation op = new Operation();
		assertEquals(-8, op.raddoppia(-4));
	}
	
	@Test
	void testRaddoppiaZero() {
		Operation op = new Operation();
		assertEquals(0, op.raddoppia(0));
	}
	

	@Test
	void testQuadratoPos() {
		Operation op =new Operation();
		assertEquals(16, op.quadrato(4));
	}
	
	@Test
	void testQuadratoNeg() {
		Operation op =new Operation();
		assertEquals(64, op.quadrato(-8));
	}
	
	@Test
	void testQuadratoZero() {
		Operation op =new Operation();
		assertEquals(0, op.quadrato(0));
	}

	@Test
	void testFibonacci() {
		Operation op = new Operation();
		List<Integer> oracle = new ArrayList<Integer>();
		oracle.add(0);
		oracle.add(1);
		oracle.add(1);
		oracle.add(2);
		oracle.add(3);
		oracle.add(5);
		assertEquals(oracle, op.fibonacci(6));
		
		
	}

}
