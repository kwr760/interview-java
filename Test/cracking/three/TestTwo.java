package cracking.three;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTwo {
  @Test
  public void testName() throws Exception {
    Two two = new Two();
    two.push(5);
    Assert.assertEquals(5, two.min().intValue());
    two.push(3);
    Assert.assertEquals(3, two.min().intValue());
    two.push(1);
    Assert.assertEquals(1, two.min().intValue());
    two.push(6);
    Assert.assertEquals(1, two.min().intValue());
    two.pop();
    Assert.assertEquals(1, two.min().intValue());
    two.pop();
    Assert.assertEquals(3, two.min().intValue());
    two.pop();
    Assert.assertEquals(5, two.min().intValue());
  }
}
