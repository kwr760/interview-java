package cracking.four;

import cracking.util.BinaryNode;

class One {
  boolean isBalanced(BinaryNode node) {
    if (null == node) {
      return true;
    }

    int heightLeft = height(node.left);
    int heightRight = height(node.right);

    System.out.println(heightLeft + " - " + heightRight);
    return (Math.abs(heightLeft - heightRight) <= 1
        && isBalanced(node.left)
        && isBalanced(node.right)
        );
  }

  private int height(BinaryNode node) {
    if (null == node) {
      return 0;
    }
    return Math.max(height(node.left), height(node.right)) + 1;
  }
}
