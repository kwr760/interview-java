package cracking.three;

import java.util.Stack;

class Five<T> {
  private Stack<T> reverseOrder = new Stack<>();
  private Stack<T> inOrder = new Stack<>();

  void add(T data) {
    this.reverseOrder.push(data);
  }

  T get() {
    if (0 != this.inOrder.size()) {
      return this.inOrder.pop();
    }

    while(0 != this.reverseOrder.size()) {
      this.inOrder.push(reverseOrder.pop());
    }

    return this.inOrder.pop();
  }

  T peek() {
    if (0 != this.inOrder.size()) {
      return this.inOrder.peek();
    }

    while(0 != this.reverseOrder.size()) {
      this.inOrder.push(reverseOrder.pop());
    }

    return this.inOrder.peek();
  }
}
