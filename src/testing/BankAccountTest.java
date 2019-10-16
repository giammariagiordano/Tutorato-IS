package testing;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.BankAccount;

class BankAccountTest {
	
	private BankAccount bankAccount;
	
	@BeforeEach
	public void setUp()  {
		bankAccount = new BankAccount(); 
	}

	@Test
	public void getSaldoInitialZeroTest() {
		assertEquals(0, bankAccount.getSaldo());
	}
	
	@Test
	public void depositaPassTest() {
		bankAccount.deposita(1);
		assertEquals(1, bankAccount.getSaldo());
	}
	
	@Test 
	public void depositaFailTest() throws IllegalArgumentException{
		final String message = "Somma non consentita per il deposito";
		IllegalArgumentException exceptionThrown = assertThrows(IllegalArgumentException.class,()-> {
			bankAccount.deposita(-1);
		});
		assertEquals(message,exceptionThrown.getMessage());
	}
	
	@Test
	public void prelevaPassTest() {
		bankAccount.deposita(2);
		bankAccount.preleva(1);
		assertEquals(1, bankAccount.getSaldo());
	}
	
	@Test
	public void prelevaFailTest() throws IllegalArgumentException{
		final String message = "Impossibile prelevare, parametro non ammesso";
		IllegalArgumentException exceptionThrown = assertThrows(IllegalArgumentException.class,()-> {
			bankAccount.preleva(-1);
		});
		assertEquals(message,exceptionThrown.getMessage());
	}
	
	@Test
	public void prelevaFailDueTest() throws IllegalArgumentException{
		bankAccount.deposita(5);
		final String message = "Saldo disponibile inferiore alla somma richiesta";
		IllegalArgumentException exceptionThrown = assertThrows(IllegalArgumentException.class,()-> {
			bankAccount.preleva(6);
		});
		assertEquals(message,exceptionThrown.getMessage());
	}


}
