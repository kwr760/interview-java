package cracking.two;

import org.testng.annotations.Test;

public class TestTwo {
  @Test
  public void testName() throws Exception {
    Two two = new Two();
    two.add(1);
    two.add(2);
    two.add(3);
    two.add(4);
    two.add(5);
    two.add(6);
    two.add(7);

    System.out.println(two.findNthToLast(0));
    System.out.println(two.findNthToLast(2));
    System.out.println(two.findNthToLast(6));
    try {
      System.out.println(two.findNthToLast(8));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
