package cracking.three;

import org.testng.annotations.Test;

public class TestFour {

  @Test
  public void testName() throws Exception {
    int n = 3;
    Four[] towers = new Four[n];
    for (int i = 0; i < 3; i++) {
      towers[i] = new Four(i);
    }

    int height = 10;
    for (int i = height - 1; i >= 0; i--) {
      towers[0].add(i);
    }

    towers[0].moveDisks(height, towers[2], towers[1]);
  }
}
