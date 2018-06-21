package cracking.three;

import java.util.ArrayList;
import java.util.Stack;

public class Three {
  final int MAX_HEIGHT = 5;
  private int top = 0;
  private ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();

  public Three() {
    this.stacks.add(new Stack<Integer>());
  }

  public Integer push(Integer item) {
    Stack<Integer> stack = this.stacks.get(this.top);
    if (stack.size() == (this.MAX_HEIGHT)) {
      stack = new Stack<Integer>();
      this.stacks.add(stack);
      this.top++;
    }

    System.out.println("Pushed: " + item + " onto - " + this.top);
    stack.add(item);
    return item;
  }

  public Integer pop() {
    Stack<Integer> stack = this.stacks.get(this.top);
    Integer item = stack.pop();
    System.out.println("popped: " + item + " off = " + this.top);
    if (stack.size() == 0) {
      this.stacks.remove(this.top);
      this.top--;
    }

    return item;
  }
}
