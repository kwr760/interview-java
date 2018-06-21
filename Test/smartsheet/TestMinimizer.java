package smartsheet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMinimizer {
  @Test
  public void testEmpty() {
    String test = "";
    String expectedResult = "";
    CodeMinimizer press = new CodeMinimizer();
    Assert.assertEquals(press.minimize(test), expectedResult);
  }

  @Test
  public void testBase() {
    String test = "you say yes, I say no you say stop and I say go go go";
    String expectedResult = "you say yes, I $1 no $0 $1 stop and $3 $1 go $12 $12";
    CodeMinimizer press = new CodeMinimizer();
    Assert.assertEquals(press.minimize(test), expectedResult);
  }

  @Test void testLarger() {
    String test = "/*\n" +
        "* Function to chop a string in half.\n" +
        "*/\n" +
        "public static string chop(string input) {\n" +
        "if (input == null || input.isEmpty()) {\n" +
        "return input;\n" +
        "}\n" +
        "if (input.length() % 2 == 1) {\n" +
        "return \"cannot chop an odd-length string in half\";\n" +
        "}\n" +
        "return input.substring(input.length() / 2);\n" +
        "}\n";
    String expectedResult = "/*\n" +
        "* Function to chop a string in half.\n" +
        "*/\n" +
        "public static $4 $2($4 input) {\n" +
        "if ($12 == null || $12.isEmpty()) {\n" +
        "return $12;\n" +
        "}\n" +
        "$13 ($12.length() % 2 == 1) {\n" +
        "$18 \"cannot $2 an odd-$22 $4 $5 $6\";\n" +
        "}\n" +
        "$18 $12.substring($12.$22() / 2);\n" +
        "}\n";
    CodeMinimizer press = new CodeMinimizer();
    Assert.assertEquals(press.minimize(test), expectedResult);
  }
}
