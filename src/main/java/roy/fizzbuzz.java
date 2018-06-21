package roy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class fizzbuzz {
	public void runFizzBuzz(int A, int B, int N){
		for (int i = 1; i <= N; i++) {
			if ((0 == i % A) && (0 == i % B))
				System.out.print( "FB");
			else if (0 == i % A)
				System.out.print( "F");
			else if (0 == i % B)
				System.out.print("B");
			else
				System.out.print(i);
			
			if (i != N)
				System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		fizzbuzz f = new fizzbuzz();
		
		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split("\\s");
				if (lineArray.length > 0) {
					f.runFizzBuzz(new Integer(lineArray[0]), new Integer(lineArray[1]), new Integer(lineArray[2]));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}
}
