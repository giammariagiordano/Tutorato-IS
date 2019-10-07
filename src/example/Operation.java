package example;

import java.util.ArrayList;
import java.util.List;

//metodo raddoppia, quadrato, somma
public class Operation {
	
	public Operation () {
	}
	/**
	 * @Method somma: return sum of two integer
	 * @param  num1 int;
	 * @param  num2 int;
	 * @return num1+num2;
	 */
	
	public int somma(Integer num1, Integer num2) {
		if(num1 == null || num2 == null)
			throw new NullPointerException();
		return num1+num2;
	}
	
	/**
	 * @Method raddoppia: return double number
	 * @param  num int;
	 * @return num*2
	 */
	
	public int raddoppia(int num) {
		return num*2;
	}
	
	/**
	 * @Method quadrato: return power number
	 * @param  num int;
	 * @return num^2
	 */
	
	public int quadrato(int num) {
		return num*num;
	}
	
	/**@Method fibonacci: return the fibonacci sequence. In array app found 
	 * the first n numbers of fibonacci sequence
	 * @param  numSeq int 
	 * @return app;
	 */
	
	public List<Integer> fibonacci(int numSeq) {
		int num1=0, num2=1;
		List<Integer> app = new ArrayList<Integer>();
		app.add(num1);
		app.add(num2);
		for (int i=2; i<numSeq;++i) {
			app.add(num1+num2);
			num1=num2;
			num2=app.get(app.size());
		}
		return app;
	}
	
}
