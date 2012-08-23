package challenge.roy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class lowercase {
	String toLowercase(String string) {
		StringBuilder lower = new StringBuilder("");
		
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			
			if (ch >= 65 && ch <= 90)
				ch += 32;
			
			lower.append(ch);
		}
		
		return lower.toString();
	}
	public static void main(String[] args) {
		lowercase l = new lowercase();
		
		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split("\\s");
				if (lineArray.length > 0) {
					System.out.println(l.toLowercase(line));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}
}
