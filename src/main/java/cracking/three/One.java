package cracking.three;

public class One {
  private int size;
  private int[] stacks;
  private int[] stackPosition = {-1, -1, -1};

  public One(int size) {
    this.size = size;
    this.stacks = new int[stackPosition.length * size];
  }

  void push(int stack, Integer value) throws RuntimeException {
    if (isFull(stack)) {
      throw new RuntimeException("That stack is full.");
    }
    int position = getStackPosition(stack);
    this.stackPosition[stack] = ++position;
    this.stacks[position] = value;
  }

  Integer pop(int stack) throws RuntimeException {
    if (isEmpty(stack)) {
      throw new RuntimeException("That stack is empty");
    }
    int position = getStackPosition(stack);
    Integer value = this.stacks[position];
    this.stacks[position] = 0;
    this.stackPosition[stack] = position - 1;
    return value;
  }

  public Integer peep(int stack) throws RuntimeException {
    if (isEmpty(stack)) {
      throw new RuntimeException("That stack is empty.");
    }
    int position = getStackPosition(stack);
    return this.stacks[position];
  }

  private boolean isEmpty(int stack) throws ArrayIndexOutOfBoundsException {
    int position = this.stackPosition[stack];
    return (-1 == position);
  }

  private boolean isFull(int stack) throws ArrayIndexOutOfBoundsException {
    int position = this.stackPosition[stack];
    return ((this.size - 1) == position);
  }

  private int getStackPosition(int stack) throws RuntimeException {
    int position = this.stackPosition[stack];
    return stack * this.size + position;
  }
}
