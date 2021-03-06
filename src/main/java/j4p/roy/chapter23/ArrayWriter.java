package j4p.roy.chapter23;

public class ArrayWriter implements Runnable {
	private final SimpleArray sharedSimpleArray;
	private final int startValue;
	
	ArrayWriter(int value, SimpleArray array) {
		startValue = value;
		sharedSimpleArray = array;
	}
	
	public void run() {
		for (int i = startValue; i < startValue + 3; i++) {
			sharedSimpleArray.add(i);
		}
	}

}
