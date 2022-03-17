import java.util.Scanner;

/**
 * @author Salah
 */

public class C {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long num1 = scan.nextLong();
    long num2 = scan.nextLong();
    long addition = num1 + num2;
    long multiplication = num1 * num2;
    long subtraction = num1 - num2;
    System.out.println(num1 + " + " + num2 + " = " + addition + "\n" + num1 + " * " + num2 + " = " + multiplication + "\n" + num1 + " - " + num2 + " = " + subtraction);
  }
}
