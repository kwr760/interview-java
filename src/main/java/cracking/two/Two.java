package cracking.two;

public class Two<T> {
  private Node head;
  private Node tail;

  private class Node {
    private T data;
    private Node next;

    Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  Two() {
    this.head = null;
    this.tail = null;
  }

  void add(T item) {
    if (null == item) {
      throw new NullPointerException("The data is empty");
    }

    Node next = new Node(item, null);
    if (null == head) {
      this.head = next;
      this.tail = next;
    } else {
      this.tail.next = next;
      this.tail = next;
    }
  }

  Object findNthToLast(int n) throws Exception {
    Node nthtolast = null;
    Node current = this.head;
    int count = 0;

    while (null != current) {
      if (count == n) {
        nthtolast = this.head;
      } else if (null != nthtolast) {
        nthtolast = nthtolast.next;
      }

      current = current.next;
      count++;
    }

    if (null == nthtolast) {
      throw new Exception("Nth to last is not found.");
    }

    return nthtolast.data;
  }
}
