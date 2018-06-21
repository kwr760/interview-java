package cracking.two;

import cracking.util.Node;
import org.testng.annotations.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestFive {
  @Test
  public void testOne() {
    Five five = new Five();

    Node<Integer> list1 = new Node(7, new Node( 4, new Node( 5, new Node( 3, null))));
    Node<Integer> list2 = new Node(7, new Node( 4, new Node( 3, null)));
    Node<Integer> sum = five.addLinkedLists(list1, list2, 0);
    sum.print();

    list1 = new Node(9, new Node( 9, new Node( 8, new Node( 3, null))));
    list2 = new Node(7, new Node( 4, new Node( 3, null)));
    sum = five.addLinkedLists(list1, list2, 0);
    sum.print();

    sum = five.addLinkedLists(null, null, 0);
    sum.print();
  }

  @Test
  public void testTwo() {
    Five five = new Five();

    LinkedListNode num1 = new LinkedListNode(7);
    num1.add(9);
    num1.add(4);
    num1.add(2);
    LinkedListNode num2 = new LinkedListNode(5);
    num2.add(8);

    LinkedListNode sum = five.addLists(num1, num2);
  }

  @Test
  public void testThree() {
    Queue queue = new PriorityQueue();
  }
}
