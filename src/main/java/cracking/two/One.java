package cracking.two;

import java.util.HashMap;

class One<T> {
  private Node head;
  private Node tail;

  private class Node<T> {
    private T data;
    private Node next;

    Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  One() {
    this.head = null;
    this.tail = null;
  }

  void add(T data) {
    Node next = new Node<>(data, null);
    if (null == this.head) {
      this.head = next;
      this.tail = this.head;
    } else {
      this.tail.next = next;
      this.tail = next;
    }
  }

  void removeDups() {
    HashMap<Object, Boolean> uniqs = new HashMap<>();

    Node current = this.head;
    Node previous = null;
    while (null != current) {
      Object key = current.data;
      if (uniqs.containsKey(key)) {
        previous.next = current.next;
      } else {
        uniqs.put(key, true);
        previous = current;
      }
      current = current.next;
    }

    printLinkedList();
  }

  private void printLinkedList() {
    Node current = this.head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  void removeDupsDoubleLoop() {
    Node current = this.head;
    while (null != current) {
      Object key = current.data;
      Node inner = current.next;
      Node previous = current;
      while (null != inner) {
        if (key.equals(inner.data)) {
          previous.next = inner.next;
        } else {
          previous = inner;
        }
        inner = inner.next;
      }
      current = current.next;
    }

    printLinkedList();
  }
}
