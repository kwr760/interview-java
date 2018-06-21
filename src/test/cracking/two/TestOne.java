package cracking.two;

import org.testng.annotations.Test;

public class TestOne {
  @Test
  public void testName() throws Exception {
    One one = new One();
    one.add('F');
    one.add('O');
    one.add('L');
    one.add('L');
    one.add('O');
    one.add('W');
    one.add(' ');
    one.add('U');
    one.add('P');
    one.removeDups();
    one = new One();
    one.add('F');
    one.add('O');
    one.add('L');
    one.add('L');
    one.add('O');
    one.add('W');
    one.add(' ');
    one.add('U');
    one.add('P');
    one.removeDupsDoubleLoop();
  }
}
