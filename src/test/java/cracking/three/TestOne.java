package cracking.three;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {
  @Test
  public void testName() throws Exception {
    One threeStack = new One(5);
    threeStack.push(0, 1);
    threeStack.push(0, 2);
    threeStack.push(0, 3);
    threeStack.push(0, 4);
    threeStack.push(0, 5);
    Integer val = threeStack.pop(0);
    Assert.assertEquals(5, val.intValue());
    threeStack.push(2, 10);
  }
}
