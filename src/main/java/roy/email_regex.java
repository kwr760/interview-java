package roy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_regex {
	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public email_regex() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	public boolean validate(final String email) {
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static void main(String[] args) {
		email_regex f = new email_regex();

		try {
			String filename;
			if (args.length > 0)
				filename = args[0];
			else
				filename = "test/email.txt";
			File file = new File(filename);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split("\\s");
				if (lineArray.length > 0) {
					System.out.println(f.validate(line));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.exit(0);
	}
}
