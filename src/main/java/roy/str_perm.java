package roy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class str_perm {
	private boolean first = true;

	public void permutation(StringBuilder perm, int position, String str) {
		str += perm.charAt(position);
		perm.deleteCharAt(position);

		if (0 == perm.length()) {
			if (true == first) {
				System.out.print(str);
				first = false;
			}
			else {
				System.out.print("," + str);
			}
			return;
		}
		
		for (int i = 0; i < perm.length(); i++) {
			StringBuilder copy = new StringBuilder(perm);
			permutation(copy, i, str);
		}
	
		return;
	}
	
	public void permutation(StringBuilder perm) {
		first = true;
		for (int i = 0; i < perm.length(); i++) {
			char [] sort = perm.toString().toCharArray();
			Arrays.sort(sort);
			StringBuilder sorted = new StringBuilder(new String(sort));
			permutation(sorted, i, "");
		}
	}
	
	public static void main(String[] args) {
		str_perm f = new str_perm();

		try {
			String filename;
			if (args.length > 0)
				filename = args[0];
			else
				filename = "test/permutation.txt";
			File file = new File(filename);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split("\\s");
				if (lineArray.length > 0) {
					f.permutation(new StringBuilder(line));
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
