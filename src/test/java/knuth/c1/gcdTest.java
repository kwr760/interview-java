package knuth.c1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class gcdTest {
    @Test
    public void testGcd()
    {
        gcd obj = new gcd();
        int x = obj.findGreatestCommonDivisor(10, 10);
        Assert.assertEquals(x, 10);
        x = obj.findGreatestCommonDivisor(10, 7);
        Assert.assertEquals(x, 1);
        x = obj.findGreatestCommonDivisor(10, 6);
        Assert.assertEquals(x, 2);
        x = obj.findGreatestCommonDivisor(2166, 6099);
        Assert.assertEquals(x, 57);
    }
}
