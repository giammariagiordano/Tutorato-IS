package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import example.ATMCard;
import org.junit.jupiter.api.Test;

class ATMCardTest {
  static private ATMCard atm;
  @BeforeAll
  static void createATM() {
    atm = new ATMCard();
  }
  
  @Test
  void testCase2Dot2() {
    int newPin = 5555;
    atm.changePin(newPin);
    assertTrue(atm.confirmPin(newPin));
  }
}
