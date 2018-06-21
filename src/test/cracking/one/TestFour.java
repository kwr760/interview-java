package cracking.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFour {
  @Test
  public void testName() throws Exception {
    Four four = new Four();
    Assert.assertEquals("Mr%20John%20Smith".toCharArray(), four.encodeSpace("Mr John Smith    ".toCharArray()));
  }
}
