package cracking.one;

import java.util.HashMap;

public class One {
    void containsAllUniqueChars(String inputString)
    {
        if (containsAllUniqueCharsSimple(inputString)) {
            System.out.println("The string " + inputString + " contains all unique chars.");
        } else {
            System.out.println("The string " + inputString + " does not contain all unique chars.");
        }
        if (containsAllUniqueCharsNoDataStructure(inputString)) {
            System.out.println("The string " + inputString + " contains all unique chars.");
        } else {
            System.out.println("The string " + inputString + " does not contain all unique chars.");
        }
    }

    private boolean containsAllUniqueCharsSimple(String input)
    {
        HashMap<Character, Boolean> usedChars = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (usedChars.containsKey(currentChar)) {
                return false;
            }

            usedChars.put(currentChar, true);
        }
        return true;
    }

    private boolean containsAllUniqueCharsNoDataStructure(String input)
    {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++)
            {
                if (currentChar == input.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
