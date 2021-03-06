package cracking.stack;

public class QuestionB {
	private static int number_of_stacks = 3;
	private static int default_size = 4;
	private static int total_size = default_size * number_of_stacks;
	private static StackData[] stacks = {new StackData(0, default_size), new StackData(default_size, default_size), new StackData(default_size * 2, default_size)};
	private static int[] buffer = new int[total_size];
	
	public static void main(String [] args) throws Exception {
		push(0, 10);
		push(1, 20);
		push(2, 30);
		System.out.println(pop(0));
	}
	
	private static int numberOfElements() {
		return stacks[0].size + stacks[1].size + stacks[2].size;
	}
	
	private static int nextElement(int index){
		if (index + 1 == total_size)
			return 0;
		else
			return index + 1;
	}
	
	private static int previousElement(int index){
		if (index == 0)
			return total_size - 1;
		else
			return index - 1;
	}
	
	private static void shift(int stackNum) {
		StackData stack = stacks[stackNum];
		if (stack.size >= stack.capacity) {
			int nextStack = (stackNum + 1) % number_of_stacks;
			shift(nextStack);
			stack.capacity++;
		}
		
		for (int i = (stack.start + stack.capacity - 1) % total_size; stack.isWithinStack(i, total_size); i = previousElement(i)) {
			buffer[i] = buffer[previousElement(i)];
		}
	}
	
	private static void expand(int stackNum) {
		shift((stackNum + 1) % number_of_stacks);
		stacks[stackNum].capacity++;
	}
	
	private static void push(int stackNum, int value) throws Exception {
		StackData stack = stacks[stackNum];
		
		if (stack.size >= stack.capacity) {
			if (numberOfElements() >= total_size) {
				throw new Exception("Out Of Range");
			}
			else {
				expand(stackNum);
			}
		}
		
		stack.size++;
		stack.pointer = nextElement(stack.pointer);
		buffer[stack.pointer] = value;
	}

	private static int pop(int stackNum) throws Exception {
		StackData stack = stacks[stackNum];
		
		if (stack.size == 0) {
			throw new Exception("Trying to pop empty stack.");
		}
		
		int value = buffer[stack.pointer];
		buffer[stack.pointer] = 0;
		stack.pointer = previousElement(stack.pointer);
		stack.size--;
		return value;
	}

	public static int peek(int stackNum) throws Exception {
		StackData stack = stacks[stackNum];
		
		if (stack.size == 0) {
			throw new Exception("Trying to pop empty stack.");
		}
		
		return buffer[stack.pointer];
	}
	
	public static boolean isEmpty(int stackNum) throws Exception {
		StackData stack = stacks[stackNum];
		
		return stack.size == 0;
	}
}
