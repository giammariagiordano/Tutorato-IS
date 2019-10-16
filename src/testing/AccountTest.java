package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import example.Account;
import example.DatabaseManagement;

class AccountTest {
  private  Account account;
  private static DatabaseManagement db;

  @BeforeAll
  static void CreateAccount() {
    db = new DatabaseManagement();
  }

  @Test
  void testAccountPass() {
      account = new Account("V.Rossi@studenti.unisa.it", "123456789");
      assertTrue(db.login(account));
  }
  
  @Test
  void testAccountFailure() {
      account = new Account("V.Ro@studenti.unisa.it", "123456789");
      assertFalse(db.login(account));
  }

  @Test
  void testPasswordFailure() {
	  account = new Account("V.Rossi@studenti.unisa.it", "1234567");
      assertFalse(db.login(account));  
  }
  
  @Test
  void testPasswordAccountFailure() {
	  account = new Account("V.Ro@studenti.unisa.it", "1234567");
      assertFalse(db.login(account));  
  }
  
  
}
