package cracking.two;

import java.util.HashMap;
import java.util.LinkedList;

public class OneDataType {
  public LinkedList<Character> removeDups(LinkedList<Character> str) {
    HashMap<Character, Boolean> chars = new HashMap<>();
    for (int i = 0; i < str.size(); i++) {
      Character key = str.get(i);
      if (chars.containsKey(key)) {
        str.remove(i--);
      } else {
        chars.put(key, true);
      }
    }
    return str;
  }
  public LinkedList<Character> removeDupsDoubleLoop(LinkedList<Character> str) {
    for (int i = 0; i < str.size(); i++) {
      Character key = str.get(i);
      for (int j = 0; j < i; j++) {
        if (key == str.get(j)) {
          str.remove(i--);
          break;
        }
      }
    }
    return str;
  }
}
