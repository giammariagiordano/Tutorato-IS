package example;

import java.util.ArrayList;
import java.util.List;

public class Operation {
	
	public Operation () {
	}
	/**
	 *@param number: int
	 *@return sum number + number if the number is even, else return number * 2
	 * */
	
	public int sommaOrRaddoppia(int number) {
		int toReturn;
		if(number % 2 == 0 ) {
			toReturn = number + number;
		} else {
			toReturn = number * 2;
		}
		return toReturn;
	}
	

	
}
