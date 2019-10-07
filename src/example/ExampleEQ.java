package example;

import java.security.InvalidParameterException;

public class ExampleEQ {
  private String password;

  public ExampleEQ(String password) {
    this.password = password;
  }

  public ExampleEQ() {
    this.password = "";
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  /**
   * @Method: validate password, check the length of the password 
   * @param password
   * @return true if the password is >= & and <= 15, else return false
   * @throws InvalidParameterException if the password is null
   * */
  public boolean validatePassword(String password) {
    if(password == null)
      throw new InvalidParameterException("Password Null");
    return password.length()>= 6 && password.length()<=15;
  }
}
