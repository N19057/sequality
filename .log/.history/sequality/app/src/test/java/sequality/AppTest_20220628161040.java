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

    String teststring = "Sum of " + testin1 + " and " + testin2 + " is " + sumavetest.sum(testin1, testin2)+ ". Average is " + sumavetest.ave(testin1, testin2) + '.';

    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", teststring);

    testin1 = 1;
    


  }
}
