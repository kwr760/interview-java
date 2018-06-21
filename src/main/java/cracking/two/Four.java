package cracking.two;

import cracking.util.Node;

class Four {
  Node splitByValue(Node head, Integer split) {
    Node front = null;
    Node frontEnd = null;
    Node back = null;
    Node backEnd = null;

    Node current = head;
    while (null != current) {
      Integer value = new Integer(current.data.toString());
      Node item = new Node(current.data, null);
      current = current.next;
      if (0 < split.compareTo(value)) {
        if (null == front) {
          front = item;
        }
        if (null != frontEnd) {
          frontEnd.next = item;
        }
        frontEnd = item;
      } else {
        if (null == back) {
          back = item;
        }
        if (null != backEnd) {
          backEnd.next = item;
        }
        backEnd = item;
      }
    }

    if (null == front) {
      return back;
    }

    frontEnd.next = back;

    return front;
  }
}
