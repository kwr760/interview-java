package roy.chapter23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
	public static void main(String[] args) {
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");
		
		System.out.println("Starting Executor");
		
		ExecutorService threadExectuor = Executors.newCachedThreadPool();
		threadExectuor.execute(task1);
		threadExectuor.execute(task2);
		threadExectuor.execute(task3);
		threadExectuor.shutdown();
		System.out.println("Tasks started, main ends");
	}
}
