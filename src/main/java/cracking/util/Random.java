package cracking.util;

public class Random {
  public static int getRandom() {
    return getRandom(100);
  }

  private static int getRandom(int max) {
    java.util.Random rand = new java.util.Random();
    return rand.nextInt(max) + 1;
  }
}
