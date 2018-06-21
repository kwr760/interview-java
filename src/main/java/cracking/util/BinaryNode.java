package cracking.util;

public class BinaryNode {
  public Integer item;
  public BinaryNode parent;
  public BinaryNode left;
  public BinaryNode right;

  public BinaryNode(Integer value) {
    this.item = value;
    this.left = null;
    this.right = null;
  }

  public BinaryNode add(Integer value) {
    if (0 < value.compareTo(this.item)) {
      if (null == this.right) {
        this.right = new BinaryNode(value);
        this.right.parent = this;
        return this.right;
      } else {
        return this.right.add(value) ;
      }
    } else {
      if (null == this.left) {
        this.left = new BinaryNode(value);
        this.left.parent = this;
        return this.left;
      } else {
        return this.left.add(value);
      }
    }
  }

  public void printPreOrder() {
    System.out.println(this.item);
    if (null != this.left) {
      this.left.printPreOrder();
    }
    if (null != this.right) {
      this.right.printPreOrder();
    }
  }

  public void printInOrder() {
    if (null != this.left) {
      this.left.printInOrder();
    }
    System.out.println(this.item);
    if (null != this.right) {
      this.right.printInOrder();
    }
  }

  public void printPostOrder() {
    if (null != this.left) {
      this.left.printPostOrder();
    }
    if (null != this.right) {
      this.right.printPostOrder();
    }
    System.out.println(this.item);
  }
}
