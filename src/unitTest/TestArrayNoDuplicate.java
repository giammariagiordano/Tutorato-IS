package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import example.ArrayNoDuplicate;

class TestArrayNoDuplicate {
	static ArrayNoDuplicate array = new ArrayNoDuplicate();
	
	@BeforeAll
	static void addElements() {
		array.add(0);
		array.add(1);
		array.add(42);
		array.add(10);
	}
	@Test
	void testAddWithDuplicate() {
		boolean ris = array.add(0);
		assertFalse(ris);
	}
	@Test
	void testAddWithoutDuplicate() {
		boolean ris = array.add(99);
		assertTrue(ris);
	}
	@Test
	void testAddNullValue() {
		assertThrows(NullPointerException.class, () -> array.add(null));

	}

}
