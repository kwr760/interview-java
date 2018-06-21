package cracking.stack;

public class StackData {
	int start;
	int pointer;
	public int size = 0;
	int capacity;
	
	StackData(int _start, int _capacity) {
		start = _start;
		pointer = _start - 1;
		capacity = _capacity;
	}
	
	boolean isWithinStack(int index, int total_size) {
		if (start <= index && index < start + capacity) {
			return true;
		}

		if (start + capacity > total_size && index < (start + capacity) % total_size) {
			return true;
		}
		return false;
	}
}
