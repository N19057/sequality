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

    int testin1 = 2;
    int testin2 = 3;
    int testsum = ;
    double testave = 2.5;


    String teststring = "Sum of " + testin1 + " and " + testin2 + " is " + testsum + ". Average is " + testave;

    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", teststring);



  }
}
