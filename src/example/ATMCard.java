package example;

public class ATMCard {
  int pin;

  public ATMCard() {
    pin = 1234;
  }
  
  public void changePin(int newPin) {
      this.pin = newPin;
  }
  public boolean confirmPin(int newPin) {
    return newPin == this.pin;
  }
  
}
