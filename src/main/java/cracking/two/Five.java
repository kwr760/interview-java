package cracking.two;

import cracking.util.Node;

class Five {
  Node addLinkedLists(Node<Integer> list1, Node<Integer> list2, int carry)
  {
    if (list1 == null && list2 == null && carry == 0) {
      return null;
    }

    int value = carry;
    if (list1 != null) {
      value += list1.data;
    }
    if (list2 != null) {
      value += list2.data;
    }

    int newCarry = 0;
    if (value >= 10) {
      newCarry = 1;
      value = value - 10;
    }
    Node<Integer> next1 = null;
    if (null != list1) {
      next1 = list1.next;
    }
    Node<Integer> next2 = null;
    if (null != list2) {
      next2 = list2.next;
    }

    Node<Integer> node = new Node(value, null);
    node.next = addLinkedLists(next1, next2, newCarry);

    return node;
  }

  LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
    int len1 = length(l1);
    int len2 = length(l2);

    if (len1 < len2) {
      l1 = padList(l1, len2 - len1);
    } else {
      l2 = padList(l2, len1 - len2);
    }

    PartialSum sum = addListsHelper(l1, l2);

    if (sum.carry == 0) {
      return sum.sum;
    } else {
      LinkedListNode result = insertBefore(sum.sum, sum.carry);
      return result;
    }
  }

  PartialSum addListsHelper(LinkedListNode l1, LinkedListNode l2) {
    if (l1 == null && l2 == null) {
      PartialSum sum = new PartialSum();
      return sum;
    }

    PartialSum sum = addListsHelper(l1.next, l2.next);

    int val = sum.carry + l1.data + l2.data;

    LinkedListNode full_result = insertBefore(sum.sum, val % 10);

    sum.sum = full_result;
    sum.carry = val / 10;
    return sum;
  }

  LinkedListNode padList(LinkedListNode l1, int padding) {
    LinkedListNode head = l1;
    for (int i = 0; i < padding; i++) {
      LinkedListNode n = new LinkedListNode(0);
      head.prev = n;
      n.next = head;
      head = n;
    }
    return head;
  }

  LinkedListNode insertBefore(LinkedListNode list, int data) {
    LinkedListNode node = new LinkedListNode(data);
    if (list != null) {
      list.prev = node;
      node.next = list;
    }
    return node;
  }

  int length(LinkedListNode node) {
    int len = 0;
    while (node != null) {
      len++;
      node = node.next;
    }

    return len;
  }
}
