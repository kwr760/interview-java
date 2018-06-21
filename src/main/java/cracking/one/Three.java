package cracking.one;

class Three {
  boolean isPermutation(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }

    for (int i = 0; i < a.length(); i++) {
      char c = a.charAt(i);
      int pos = b.indexOf(c);
      if (pos == -1) {
        return false;
      }
      b = b.substring(0, pos) + b.substring(pos + 1, b.length());
    }

    return 0 == b.length();
  }
}
