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
      int testin1 = 2;
      int testin2 = 3;

      String teststring = "Sum of " + testin1 + " and " + testin2 + " is " + sumavetest.sum(testin1, testin2)
          + ". Average is " + sumavetest.ave(testin1, testin2) + '.';
    }
}
