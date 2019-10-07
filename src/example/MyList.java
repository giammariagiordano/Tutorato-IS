package example;

import java.util.ArrayList;
import java.util.List;

public class MyList {
  List<Integer> list;

  
  public MyList(List<Integer> list) {
    this.list = list;
  }

  public MyList() {
    this.list = new ArrayList<Integer>();
  }

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }
  /**
   * @method: searchNumber: search if the number is present n the list
   * @param: number: Integer
   * @return:true if the number was found, else return false
   * @throws: IllegalArgumentException if the number is null
   * */
  public boolean searchNumber(Integer number) {
    boolean isFound = false;
    if(number == null)
       throw new IllegalArgumentException("Number's can't be NULL");
    for (Integer num : list) {
      if(number == num )
        isFound = true;;
    }
      return isFound;
  }
}
