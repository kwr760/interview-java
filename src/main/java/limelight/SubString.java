package limelight;

public class SubString {
	// The task mentioned to 'Signal an error'.  I preferred to returned a false value, as I think
	// throwing an exception would too strong.  I included a couple of error checks throwing
	// an error to display how to signal or throw an error.
	private boolean IsSubString(char[] base, char[] sub) throws Exception {
		if ((null == base) || (null == sub) || (sub.length == 0))
			throw new Exception("Bad arguments");
		if (base.length < sub.length)
			throw new Exception("The substring is longer than the base string.");
		
		for (int i = 0; i < base.length - (sub.length - 1); i++) {
			if (base[i] == sub[0]) {
				for (int a = i, b = 0; a < base.length && b < sub.length; a++, b++) {
					if (base[a] != sub[b])
						break;
					else if (b == (sub.length - 1))
						return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		SubString ss = new SubString();
		String base = "abcdefg";
		String good = "bcd";
//		String good = "fg";
		String err = "x";
		
		try {
			if (ss.IsSubString(base.toCharArray(), good.toCharArray()))
				System.out.println(good + " is a substring of " + base);
			else 
				System.out.println(good + " is not a substring of " + base);
			if (ss.IsSubString(base.toCharArray(), err.toCharArray()))
				System.out.println(err + " is a substring of " + base);
			else
				System.out.println(err + " is not a substring of " + base);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
