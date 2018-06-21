package cracking.two;

import cracking.util.Node;
import org.testng.annotations.Test;

public class TestThree {
  @Test
  public void testName() throws Exception {
    Node node = new Node<>('E', null);
    node = new Node<>('D', node);
    Node c = new Node<>('C', node);
    node = new Node<>('B', c);
    Node head = new Node<>('A', node);

    node = head;
    while (null != node) {
      System.out.println(node.data);
      node = node.next;
    }
    Three three = new Three();
    three.deleteNode(c);
    node = head;
    while (null != node) {
      System.out.println(node.data);
      node = node.next;
    }
  }
}
