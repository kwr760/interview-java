package cracking.one;

import org.testng.annotations.Test;

public class TestTwo {
    @Test
    public void testName() throws Exception {
        Two two = new Two();
        String str = "abcde";
        System.out.println("The reverse of " + str + " is: " + two.reverse(str));
        str = "abcdef";
        System.out.println("The reverse of " + str + " is: " + two.reverse(str));
    }
}
