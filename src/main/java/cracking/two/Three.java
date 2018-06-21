package cracking.two;

import cracking.util.Node;

class Three {
  boolean deleteNode(Node node) {
    if (null == node || null == node.next) {
      return false;
    }
    Node next = node.next;
    node.data = next.data;
    node.next = next.next;
    return true;
  }
}
