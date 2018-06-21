package cracking.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestThree {
  @Test
  public void testName() throws Exception {
    Three three = new Three();

    Assert.assertTrue(three.isPermutation("abc", "cab"));
    Assert.assertFalse(three.isPermutation("abc", "can"));
  }
}
