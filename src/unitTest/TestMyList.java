package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import example.MyList;

class TestMyList {
 static MyList mList;
  
  @BeforeAll
  static void configureList() {
    mList = new MyList();
    for(int i = 0; i < 100; i++)
      mList.getList().add(i);
  }
  
  @Test
  void testSearchFirstNumber() {
    assertTrue(mList.searchNumber(0));
  }
  @Test
  void testSearchSecondNumber() {
    assertTrue(mList.searchNumber(1));
  }
  @Test
  void testSearchLastNumber() {
    assertTrue(mList.searchNumber(99));
  }
  @Test
  void testSearchPenultimateNumber() {
    assertTrue(mList.searchNumber(98));
  }
  @Test
  void testSearchMiddleNumber() {
    assertTrue(mList.searchNumber(49));
  } 
}
