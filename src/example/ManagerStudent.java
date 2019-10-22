package example;
import java.util.ArrayList;
import java.util.List;

public class ManagerStudent {
  List<Student> students;

  public ManagerStudent() {
    students = new ArrayList<Student>();
  }

  public ManagerStudent(List<Student> students) {
    this.students = students;
  }
  
  /**
   * Aggiunge uno studente alla lista degli studenti se questo non è già presente nella lista
   * @param student rappresenta lo studente che vogliamo inserire nella lista degli studenti
   * @return vero se lo studente viene inserito, falso altrimenti
   */
  public boolean addStudent(Student student) {
    for (Student st : students) {
      if (st.equals(student))
        return false;
    }
    this.students.add(student);
    return true;
  }

  /**
   * rimuove lo studente se è presente nella lista
   * @param student
   * @return vero se lo studente viene eliminato, falso altrimenti
   */
  public boolean removeStudent(Student student) {
    return students.remove(student);
  }
/**
 * 
 * @return la media degli studenti se è possibile calcolarla, -1 altrimenti
 */
  public int averageAgeStudent() {
    int toReturn = 0;
    for (Student student : students) {
      toReturn += student.getAge();
    }
    if (this.students.size() != 0) {
      toReturn = toReturn / this.students.size();
    } else {
      toReturn = -1;
    }
    return toReturn;
  }

}
