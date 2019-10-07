package example;

import java.util.ArrayList;
import java.util.List;

public class ArrayNoDuplicate {
	List<Integer> array;

	public ArrayNoDuplicate(List<Integer> array) {
		this.array = array;
	}

	public ArrayNoDuplicate() {
		this.array = new ArrayList<Integer>();
	}

	public List<Integer> getArray() {
		return array;
	}

	public void setArray(List<Integer> array) {
		this.array = array;
	}
	/**
	 * @Method: add a number to a list if it isn't already present
	 * @param number
	 * @return true if the number is insert else, false
	 * */
	public boolean add(Integer number) {
		if(number == null) {
			throw new NullPointerException("Numbers can't be null");
		}
		boolean ris = false;
		if (this.array.contains(number))
			ris = false;
		else {
			this.array.add(number);
			ris = true;
		}
		return ris;
	}

}
