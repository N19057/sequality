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

      Calculate sumavetest = new Calculate();

      String sumave = "Sum of " + 2 + " and " + 3 + " is " + sumavetest.sum(2, 3)
          + ". Average is " + sumavetest.ave(2, 3) + '.';

      System.out.println(sumave);

      

    }
}
