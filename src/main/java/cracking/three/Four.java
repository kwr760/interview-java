package cracking.three;

import java.util.Stack;

public class Four {
  private Stack<Integer> disks;
  private int index;

  Four(int i) {
    disks = new Stack<>();
    index = i;
  }

  private int index() {
    return index;
  }

  public void add(int d) {
    if (!disks.isEmpty() && disks.peek() <= d) {
      System.out.println("Error placing disk " + d);
    } else {
      disks.push(d);
    }
  }

  private void moveTopTo(Four tower) {
    int top = disks.pop();
    tower.add(top);
    System.out.println("Move disk " + top + " from " + index() + " to " + tower.index());
  }

  void moveDisks(int n, Four dest, Four aux) {
    if (n > 0 ) {
      moveDisks(n - 1, aux, dest);
      moveTopTo(dest);
      aux.moveDisks(n - 1, dest, this);
    }
  }
}
