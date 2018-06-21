package cracking.four;

import cracking.util.BinaryNode;

public class Six {
  BinaryNode nextNode(BinaryNode node) {
    if (null != node.right) {
      return getLeftmostChild(node.right);
    } else {
      return getFirstNonRightParent(node);
    }
  }

  BinaryNode getFirstNonRightParent(BinaryNode node) {
    BinaryNode parent = node.parent;
    BinaryNode previous = node;

    while (null != parent && previous == parent.right) {
      previous = parent;
      parent = parent.parent;
    }

    return parent;
  }

  BinaryNode getLeftmostChild(BinaryNode node) {
    while (null != node.left) {
      node = node.left;
    }

    return node;
  }

  BinaryNode previousNode(BinaryNode node) {
    if (null != node.left) {
      return getRightmostChild(node.left);
    } else {
      return getFirstNonLeftParent(node);
    }
  }

  BinaryNode getRightmostChild(BinaryNode node) {
    while (null != node.right) {
      node = node.right;
    }

    return node;
  }

  BinaryNode getFirstNonLeftParent(BinaryNode node) {
    BinaryNode parent = node.parent;
    BinaryNode previous = node;

    while (null != parent && previous == parent.left) {
      previous = parent;
      parent = parent.parent;
    }

    return parent;
  }
}
