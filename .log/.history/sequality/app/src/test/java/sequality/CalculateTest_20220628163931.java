package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 6;
    assertEquals(expected, calculate.sum(3, 3));
    double expected2 = 2.5;
    assertEquals(expected2, calculate.ave(3, 2), 0);

    int expected3 = 55;
    



  }
}
