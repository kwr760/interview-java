package cracking.four;

import cracking.util.BinaryNode;

class Six {
  BinaryNode nextNode(BinaryNode node) {
    if (null != node.right) {
      return getLeftmostChild(node.right);
    } else {
      return getFirstNonRightParent(node);
    }
  }

  private BinaryNode getFirstNonRightParent(BinaryNode node) {
    BinaryNode parent = node.parent;
    BinaryNode previous = node;

    while (null != parent && previous == parent.right) {
      previous = parent;
      parent = parent.parent;
    }

    return parent;
  }

  private BinaryNode getLeftmostChild(BinaryNode node) {
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

  private BinaryNode getRightmostChild(BinaryNode node) {
    while (null != node.right) {
      node = node.right;
    }

    return node;
  }

  private BinaryNode getFirstNonLeftParent(BinaryNode node) {
    BinaryNode parent = node.parent;
    BinaryNode previous = node;

    while (null != parent && previous == parent.left) {
      previous = parent;
      parent = parent.parent;
    }

    return parent;
  }
}
