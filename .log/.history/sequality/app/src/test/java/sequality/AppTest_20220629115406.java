/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());

    Calculate sumavetest = new Calculate();
    int testin1 = 2;
    int testin2 = 3;

    String teststring = "Sum of " + testin1 + " and " + testin2 + " is " + sumavetest.sum(testin1, testin2)
        + ". Average is " + sumavetest.ave(testin1, testin2) + '.';

    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", teststring);
    testin1 = 1;
    testin2 = 2;
    int out1 = 0;
    double out2 = 0;
    int out3 = 0;
    int out4 = 0;
    for (int i = in1; i <= in2; i++) {
      out1 = c.sum(out1, i);
      if (i % 2 != 0) {
        out3 = c.sum(out3, i);
      } else if (i % 2 == 0) {
        out4 = c.sum(out4, i);
      }
    }
    out2 = (double) (out1) / (double) (in2 - in1 + 1);
    sumave = "Sum of " + in1 + " to " + in2 + " is " + out1
        + ". Average is " + out2 + '.';

  }
}