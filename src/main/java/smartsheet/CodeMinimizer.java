package smartsheet;

import java.util.HashMap;

/**
 * A class used to minimize the length of the code passed in with a String
 */
class CodeMinimizer {
  /**
   * The HashMap to keep a mapping for the found words with it's index.
   */
  private HashMap<String, Integer> identifierMap = new HashMap<>();
  private int mapIndex = 0;

  /**
   * Input a string and minimize the string replacing repeated words with their indexed location.
   * Loop through the string and replace repeated identifier with the index.
   *
   * @param code - The string to be encoded
   * @return - returns a String with the minimized version of the inputted string.
   */
  String minimize(String code) {
    StringBuilder encodedString = new StringBuilder(code.length());

    StringBuilder identifier = new StringBuilder();
    for (int i = 0; i < code.length(); i++) {
      Character ch = code.charAt(i);
      if (Character.isLetter(ch)) {
        // If the char is a letter, the loop is finding an identifier.
        identifier.append(ch);
      } else {
        // If the char is not a letter, determine if the identifier has been found and replace it.
        if (0 < identifier.length()) {
          this.appendCodedIdentifier(encodedString, identifier);
          identifier = new StringBuilder();
        }
        encodedString.append(ch);
      }
    }

    // Append the last identifier if needed.
    if (0 < identifier.length()) {
      this.appendCodedIdentifier(encodedString, identifier);
    }

    return encodedString.toString();
  }

  /**
   * Look up the found word and replace with the index.  If the word is not found add the word to the hashmap.
   *
   * @param encodedString - The resulting string which is being encoded with the $<index>
   * @param word - The mapped word stored in the hashmap and to replaced by the index.
   */
  private void appendCodedIdentifier(StringBuilder encodedString, StringBuilder word) {
    Integer position = this.identifierMap.get(word.toString());
    if (null == position) {
      this.identifierMap.put(word.toString(), this.mapIndex);
      // I believe index increase would be cleaner here, instead of after the conditional.
      // To parallel the expected output I moved it to the bottom of the method.
      // this.mapIndex++;
      encodedString.append(word);
    } else {
      encodedString.append("$").append(position);
    }
    this.mapIndex++;
  }
}
