package cracking.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPalidrone {
  @Test
  public void testOne() {
    Palidrone pal = new Palidrone();
    Assert.assertTrue(pal.isPalidrone("abccba"));
    Assert.assertTrue(pal.isPalidrone("abcba"));
    Assert.assertFalse(pal.isPalidrone("accba"));
  }
}
