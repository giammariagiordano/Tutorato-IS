package example;
/**
 * La classe BankAccount rappresenta un conto corrente. Lo stato della classe
 * consiste nel saldo del conto corrente bancario, il cui valore è un intero inizialmente nullo.
 * 
 * La classe permette di interrogare il saldo residuo e di effettuare prelievi e depositi
 * 
 * @author Giammaria Giordano
 * @author Valeria Pontillo
 * 
 * @version 1.0
 *
 */

public class BankAccount {
	private int saldo;

	public BankAccount() {
		this.saldo = 0;
	}
/**
 * 
 * @param soldi
 */
	public BankAccount(int soldi) {
		this.saldo = soldi;
	}
	
	
	
		/**
	 * Deposita dei soldi nel conto corrente. Dopo l'invocazione del metodo,
	 * in assenza di eccezioni il saldo sarà incrementato della quantità 
	 * di soldi
	 * depositata
	 * @param soldi quantità di soldi da depositare
	 * @throws IllegalArgumentException: se si deposita una quantità negativa
	 */
	public void deposita(int soldi) throws IllegalArgumentException {
		if(soldi<0)
			throw new IllegalArgumentException("Somma non consentita per il deposito");
		this.saldo += soldi;
	}

	/**
	 * Preleva dei soldi dal conto corrente. Dopo l'invocazione del metodo,
	 * in assenza di eccezioni il saldo sarà decrementato della quantità di soldi
	 * inserita
	 *  
	 * @param soldi quantità di soldi da prelevare
	 * @throws IllegalArgumentException: se si preleva una quantità negativa
	 * o se maggiore del denaro presente sul conto corrente
	 */
	public void preleva(int soldi) throws IllegalArgumentException {
		if(soldi< 0)
			throw new IllegalArgumentException("Impossibile prelevare, parametro non ammesso");
		if(soldi > this.saldo)
			throw new IllegalArgumentException("Saldo disponibile inferiore alla somma richiesta");
		//else
		this.saldo -= soldi;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
