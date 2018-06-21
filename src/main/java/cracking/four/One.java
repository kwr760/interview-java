package cracking.four;

import cracking.util.BinaryNode;

public class One {
  public boolean isBalanced(BinaryNode node) {
    if (null == node) {
      return true;
    }

    int heightLeft = height(node.left);
    int heightRight = height(node.right);

    System.out.println(heightLeft + " - " + heightRight);
    if (Math.abs(heightLeft - heightRight) <= 1
        && isBalanced(node.left)
        && isBalanced(node.right)
        ) {
      return true;
    }

    return false;
  }

  public int height(BinaryNode node) {
    if (null == node) {
      return 0;
    }
    return Math.max(height(node.left), height(node.right)) + 1;
  }
}
