package cracking.two;

public class LinkedListNode {
  public int data;
  LinkedListNode next;
  LinkedListNode prev;

  LinkedListNode(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }

  void add(int data) {
    add(data, this);
  }

  void add(int data, LinkedListNode prev) {
    if (this.next != null) {
      this.next.add(data, this);
    } else {
      this.next = new LinkedListNode(data);
      this.next.prev = prev;
    }
  }
}
