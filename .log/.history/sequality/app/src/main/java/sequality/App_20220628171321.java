/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
      System.out.println(new App().getGreeting());

      Calculate c = new Calculate();
      int in1,in2;
      in1=2;
      in2=3;

      String sumave = "Sum of " + in1 + " and " + in2 + " is " + c.sum(in1, in2)
          + ". Average is " + c.ave(in1, in2) + '.';

      System.out.println(sumave);

      int out1 = 0;
      double out2 = 0;
      int out3 = 0;
      int out4 = 0;
      in1=1;
      in2=10;
      for (int i = in1; i <= in2; i++) {
        out1 = c.sum(out1, i);
        if (i % 2 != 0) {
          out3 = c.sum(out3, i);
        }
        else if (i % 2 == 0) {
          out4 = c.sum(out4, i);
        }
      }
      out2 = (double) (out1) / (double) (in2 - in1 + 1);
      sumave = "Sum of " + in1 + " to " + in2 + " is " + out1
          + ". Average is " + out2 + '.';

      System.out.println(sumave);

      sumave = "Sum of odd of " + in1 + " to " + in2 + " is " + out3
          + ". Sum of even is " + out2 + '.';

      System.out.println(sumave);




    }
}
