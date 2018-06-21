package cracking.one;

import org.testng.annotations.Test;

public class TestOne {
    @Test
    public void testName() throws Exception {
        One one = new One();
        one.containsAllUniqueChars("abcde");
        one.containsAllUniqueChars("abccde");
    }
}
