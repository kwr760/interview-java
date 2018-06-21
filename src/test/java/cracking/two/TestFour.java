package cracking.two;

import cracking.util.Node;
import org.testng.annotations.Test;

public class TestFour {
  @Test
  public void testName() throws Exception {
    Node head = new Node<>(3, null);
    head
        .add(5)
        .add(1)
        .add(2)
        .add(4);

    head.print();
    Four four = new Four();
    Node result = four.splitByValue(head, 3);
    result.print();
  }
}
