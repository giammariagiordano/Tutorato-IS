package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import example.Account;
import example.DatabaseManagment;

class AccountTest {
  private  Account account;
  private static DatabaseManagment db;

  @BeforeAll
  static void CreateAccount() {
    db = new DatabaseManagment();
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

}
