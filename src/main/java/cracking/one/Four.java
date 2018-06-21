package cracking.one;

class Four {
  char[] encodeSpace(char [] str)
  {
    char[] ret = new char[str.length];
    for (int i = 0, j = 0; i < str.length && j < ret.length; i++, j++) {
      if (' ' != str[i]) {
        ret[j] = str[i];
      } else {
        ret[j++] = '%';
        ret[j++] = '2';
        ret[j] = '0';
      }
    }
    return ret;
  }
}
