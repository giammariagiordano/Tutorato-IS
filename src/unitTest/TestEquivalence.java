package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import example.ExampleEQ;

class TestEquivalence {
  
  @Test
  void testPasswordCorrect() {
    ExampleEQ eEQ = new ExampleEQ();
    assertTrue(eEQ.validatePassword("password"));
  }
  
  @Test
  void testInvalidPasswordLess6Character() {
    ExampleEQ eEQ = new ExampleEQ();
    assertFalse(eEQ.validatePassword("pass"));
  }
  
  @Test
  void testInvalidPasswordMore15Character() {
    ExampleEQ eEQ = new ExampleEQ();
    assertFalse(eEQ.validatePassword("password very very long"));
  }
 
}
