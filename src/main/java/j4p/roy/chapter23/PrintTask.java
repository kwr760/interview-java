package j4p.roy.chapter23;

import java.util.Random;

public class PrintTask implements Runnable {
	private final int sleepTime;
	private final String taskName;
	private final static Random generator = new Random();
	
	PrintTask(String name) {
		taskName = name;
		sleepTime = generator.nextInt(5000);
	}
	
	public void run () {
		try {
			System.out.printf("%s going to sleep for %d milliseconds.\n", taskName, sleepTime);
		}
		catch (Exception e) {
			System.out.printf("%s terminated prematurely due to interuption.\n", taskName);
		}
		
		System.out.printf("%s done sleeping\n", taskName);
	}
	
}
