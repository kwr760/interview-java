package cracking.three;

import java.util.Stack;

public class Two extends Stack<Integer> {
  Stack<Integer> minStack = new Stack<Integer>();

  public Integer push(Integer value) {
    if (value <= min()) {
      minStack.push(value);
    }
    return super.push(value);
  }

  public Integer pop() {
    Integer value = super.pop();
    if (value == min()) {
      minStack.pop();
    }
    return value;
  }

  public Integer min() {
    if (minStack.isEmpty()) {
      return Integer.MAX_VALUE;
    }
    return minStack.peek();
  }
}
