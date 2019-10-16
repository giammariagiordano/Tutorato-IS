package testing;

import static org.junit.jupiter.api.Assertions.*;

import example.SearchClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SearchClassTest {
	static SearchClass searchClassTest;
	
	@BeforeAll
	static void popolateListTest(){
		searchClassTest = new SearchClass();
		searchClassTest.popolateList();
	}

	
	@Test
	void testSearchFirstElement() {
		int number = 4;
		assertEquals(0,searchClassTest.searchElement(number));
	}

	@Test
	void testSearchNElement() {
		int number = 2;
		assertEquals(2,searchClassTest.searchElement(number));
	}
	@Test
	void testSearchElementNotPresent() {
		int number = 66;
		assertEquals(-1,searchClassTest.searchElement(number));
	}
	
}
