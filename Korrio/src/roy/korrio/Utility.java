package roy.korrio;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
	public static String loadFromFile(String filename) throws FileNotFoundException, IOException {
		File file = new File(filename);
		StringBuilder contents = new StringBuilder("");

		FileInputStream fstream = new FileInputStream(file);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;

		while ((strLine = br.readLine()) != null) {
			contents.append(strLine);
		}

		in.close();

		return contents.toString();
	}

}
