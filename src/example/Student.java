package example;

public class Student {

  private String name;
  private String surname;
  private int age;
  private String phoneNumber;
  
  
  public Student(String name, String surname, int age, String phoneNumber) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.phoneNumber = phoneNumber;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Student) {
        Student st2 = (Student)obj;
          return this.name.equals(st2.getName()) && this.surname.equals(st2.getSurname()) && 
              this.age == st2.getAge() && this.phoneNumber.equals(st2.getPhoneNumber());
    } else 
      return false;
  }
  
  
}
