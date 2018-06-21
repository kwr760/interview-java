package korrio;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Utility {
	static String loadFromFile(String filename) throws IOException {
		File file = new File(filename);
		StringBuilder contents = new StringBuilder();

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
