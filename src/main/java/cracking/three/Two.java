package cracking.three;

import java.util.Stack;

public class Two extends Stack<Integer> {
  private Stack<Integer> minStack = new Stack<>();

  public Integer push(Integer value) {
    if (value <= min()) {
      minStack.push(value);
    }
    return super.push(value);
  }

  public Integer pop() {
    Integer value = super.pop();
    if (value.equals(min())) {
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
