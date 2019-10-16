package example;

public class DatabaseManagement {
  public DatabaseManagement() {
  }
    public boolean getConnection() {
        return true;
    }
    
    public boolean login(Account account) {
      return account.getUsername().equalsIgnoreCase("V.Rossi@studenti.unisa.it") &&
       account.getPassword().equals("123456789");
    }
}
