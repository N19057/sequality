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
      in1=1;
      in2=10;
      for (int i = in1; i <= in2; i++) {
        out1 = c.sum(out1, i);
      }
      out2 = (double)(out1) / (double)(in2 - in1 + 1);

    }
}
