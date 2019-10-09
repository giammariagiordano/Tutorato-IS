package example;

import java.util.ArrayList;
import java.util.List;

public class SearchClass {
	List<Integer> numbers;
	
	public SearchClass() {
	numbers = new ArrayList<Integer>();
	}
	
	/**
	 *@Method: popolateList 
	 * */
	public void popolateList() {
		numbers.add(4);
		numbers.add(42);
		numbers.add(2);	
	}
	
	/**
	 * @Method: searchElement
	 * @param number: int
	 * @return the position of the element if is found, else return -1
	 * */
	public int searchElement(int element) {
		int position = -1;
		for (int i = 0; i<numbers.size();i++) {
			if(numbers.get(i) == element)
				position = i;
		}
		return position;
	}
}
