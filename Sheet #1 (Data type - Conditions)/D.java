import java.util.Scanner;

/**
 * @author Salah
 */

public class D {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long number1 = scan.nextLong();
    long number2 = scan.nextLong();
    long number3 = scan.nextLong();
    long number4 = scan.nextLong();
    long result1 = number1 * number2;
    long result2 = number3 * number4;
    long result3 = result1 - result2;
    System.out.println("Difference = " + result3);
  }
}
