package cracking.four;

import cracking.util.BinaryNode;
import org.testng.annotations.Test;

public class TestOne {
  @Test
  public void testOne() {
    One one = new One();
    BinaryNode node = new BinaryNode(5);
    node.add(3);
    node.add(7);
    node.add(9);
    node.add(1);
    node.add(2);

    System.out.println(one.isBalanced(node));
    System.out.println("Done");
  }
}