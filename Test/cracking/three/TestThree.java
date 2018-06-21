package cracking.three;

import org.testng.annotations.Test;

public class TestThree {
  @Test
  public void testName() throws Exception {
    Three stacks = new Three();
    stacks.push(1);
    stacks.push(2);
    stacks.push(3);
    stacks.push(4);
    stacks.push(5);
    stacks.push(6);
    stacks.push(7);
    stacks.push(8);
    stacks.push(9);
    stacks.push(10);
    stacks.push(11);
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
    stacks.pop();
  }
}
