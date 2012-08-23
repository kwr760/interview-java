package cracking.array;

import java.util.Set;
import java.util.HashSet;

public class UniqueChars {
	public boolean checkForAllUnique(String str) {
		Set<Character> check = new HashSet<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if (!check.add(Character.toLowerCase(str.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkForAllUniqueNoStruct(String str) {
		for (int i = 0; i < str.length(); i++)
		{
			for (int r = i + 1; r < str.length(); r++) 
			{
				if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(r)))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String test = "ChekForDupliats";
//		String test = "CheckForDuplicates";
		
		UniqueChars uc = new UniqueChars();
		System.out.println(test + " - All Uniques: " + uc.checkForAllUnique(test));
		System.out.println(test + " - All Uniques: " + uc.checkForAllUniqueNoStruct(test));
	}
}
