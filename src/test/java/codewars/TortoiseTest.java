package codewars;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TortoiseTest {
    @Test
    public void test1() {
        System.out.println("Basic Tests");
        Assert.assertEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
        Assert.assertEquals(new int[]{3, 21, 49}, Tortoise.race(80, 91, 37));
        Assert.assertEquals(new int[]{2, 0, 0}, Tortoise.race(80, 100, 40));
    }
}

