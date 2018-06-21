package roy.korrio;

public class LongestPalindrome {
	private String input = "";
	private String longest = "";
	
	public static void main(String[] args) {
		LongestPalindrome p = new LongestPalindrome();
		p.challengeOne();
	}
	
	public void challengeOne() {
//		input = "I like racecars that go fast";
		try {
			input = Utility.loadFromFile("C:\\Devel\\korrio-challenge\\gettysburg.txt");
		} catch (Exception e) {
			System.out.println("Could not open input file.");
			e.printStackTrace();
			return;
		}

		System.out.println("The longest palindrome is "	+ findPalindromes());
		return;
	}

	private StringBuilder buildPalindrome(StringBuilder palindrone, int start, int end) {
		if ((start < 0) || (end >= input.length()))
			return palindrone;
		
		char startChar = input.charAt(start);
		char endChar = input.charAt(end);
		if (startChar == endChar) {
			palindrone.insert(0, startChar);
			palindrone.append(endChar);
			return buildPalindrome(palindrone, start - 1, end + 1);
		} 
		else {
			return palindrone;
		}
	}

	private void oddPalindrome(int index) {
		StringBuilder palindrome = new StringBuilder(input.substring(index, index+1));
		palindrome = buildPalindrome(palindrome, index-1, index+1);
		if (palindrome.length() > longest.length())
			longest = palindrome.toString();
	}

	private void evenPalindrome(int index) {
		if ((index < input.length() - 1) && (input.charAt(index) == input.charAt(index+1))) {
			StringBuilder palindrome = new StringBuilder(input.substring(index, index+2));
			palindrome = buildPalindrome(palindrome, index-1, index+2);
			if (palindrome.length() > longest.length())
				longest = palindrome.toString();
		}
	}
	
	private String findPalindromes() {
		for (int i = 0; i < input.length(); i++) {
			oddPalindrome(i);
			evenPalindrome(i);
		}

		return longest.toString();
	}
}
