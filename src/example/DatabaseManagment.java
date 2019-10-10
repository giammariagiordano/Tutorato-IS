package example;

public class DatabaseManagment {
  public DatabaseManagment() {
  }
    public boolean getConnection() {
        return true;
    }
    
    public boolean login(Account account) {
      return account.getUsername().equalsIgnoreCase("V.Rossi@studenti.unisa.it") &&
       account.getPassword().equals("123456789");
    }
}
