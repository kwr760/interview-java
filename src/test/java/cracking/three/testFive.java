package cracking.three;

import org.testng.annotations.Test;

public class testFive {
  @Test
  void testOne() {
    Five five = new Five();

    five.add(1);
    five.add(2);
    five.add(3);
    System.out.println(five.peek());
    System.out.println(five.get());
    five.add(4);
    System.out.println(five.get());
    System.out.println(five.get());
    five.add(5);
    System.out.println(five.get());
    System.out.println(five.get());
  }
}
