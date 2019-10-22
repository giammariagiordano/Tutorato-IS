package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import example.ManagerStudent;
import example.Student;

class ManagerStudentTest {
  static ManagerStudent managerStudent;
  static Student student;

  @BeforeEach
   void setUp() throws Exception {
    managerStudent = new ManagerStudent();
    student = new Student("Massimo", "Rossi", 20, "+393331335472");
  }

  @AfterAll
  static void tearDown() throws Exception {
    managerStudent = null;
    student = null;
  }

  @Test
  void testAddStudentNotPresent() {
    assertTrue(managerStudent.addStudent(student));
  }
  @Test
  void testAddStudentAlreadyPresent() {
    managerStudent.addStudent(student);
    assertFalse(managerStudent.addStudent(student));
  }

  @Test
  void testRemoveStudentAlreadyPresent() {
    managerStudent.addStudent(student);
    assertTrue(managerStudent.removeStudent(student));
  }
  @Test
  void testRemoveStudentNotPresent() {
    Student newStudent = new Student("Mario","Rossi",24,"+392442886594");
    assertFalse(managerStudent.removeStudent(newStudent));
  }

  @Test
  void testAverageOnlyOneStudentAgeStudent() {
    managerStudent.addStudent(student);
    int average = managerStudent.averageAgeStudent();
    assertEquals(20, average);
  }
  @Test
  void testAverageNStudentsAgeStudent() {
    managerStudent.addStudent(new Student("Mario","Rossi",24,"+392782888594"));
    managerStudent.addStudent(new Student("Giovanni","Zampaglione",30,"+395552886594"));
    managerStudent.addStudent(new Student("Raimondo","Ciancia",28,"+396662886594"));
    managerStudent.addStudent(new Student("Alessandro","D'Avino",34,"+397772886594"));
    assertEquals(29, managerStudent.averageAgeStudent());
  }
  @Test
  void testAverageAgeEmptyStudent() {
    assertEquals(-1, managerStudent.averageAgeStudent());
  } 

}
