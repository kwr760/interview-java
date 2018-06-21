package cracking.four;

import cracking.util.BinaryNode;
import cracking.util.Random;
import org.testng.annotations.Test;

public class TestBinaryNode {
  @Test
  public void testOne() {
    BinaryNode root = new BinaryNode(Random.getRandom());

    for (int i = 0; i < 10; i++) {
      root.add(Random.getRandom());
    }

    System.out.println("Pre-Order");
    root.printPreOrder();
    System.out.println("In-Order");
    root.printInOrder();
    System.out.println("Post-Order");
    root.printPostOrder();
  }
}
