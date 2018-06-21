package roy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class substring {
	public boolean IsSubString(String base, String sub) throws Exception {
		if ((null == base) || (null == sub) || (sub.length() == 0))
			throw new Exception("Bad arguments");
		if (base.length() < sub.length())
			throw new Exception("The substring is longer than the base string.");
		
		for (int i = 0; i < base.length() - (sub.length() - 1); i++) {
			if (base.charAt(i) == sub.charAt(0)) {
				for (int a = i, b = 0; a < base.length() && b < sub.length(); a++, b++) {
					if (sub.charAt(b) == '*')
						return IsSubString(base.substring(a, base.length()), sub.substring(b+1, sub.length()));
					else if (base.charAt(a) != sub.charAt(b))
						break;
					else if (b == (sub.length() - 1))
						return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		substring l = new substring();
		
		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split(",");
				if (lineArray.length > 0) {
					System.out.println(l.IsSubString(lineArray[0], lineArray[1]));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}
}
