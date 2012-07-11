package cracking.stack;

public class StackData {
	public int start;
	public int pointer;
	public int size = 0;
	public int capacity;
	
	public StackData(int _start, int _capacity) {
		start = _start;
		pointer = _start - 1;
		capacity = _capacity;
	}
	
	public boolean isWithinStack(int index, int total_size) {
		if (start <= index && index < start + capacity) {
			return true;
		}
		else if (start + capacity > total_size && index < (start + capacity) % total_size) {
			return true;
		}
		return false;
	}
}
