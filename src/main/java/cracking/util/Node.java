package cracking.util;

public class Node<T> {
  public T data;
  public Node<T> next;

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  public Node add(T data) {
    Node<T> node = new Node<>(data, null);
    this.next = node;
    return node;
  }

  public void print() {
    Node current = this;
    while (null != current) {
      System.out.println(current.data);
      current = current.next;
    }
  }
}
