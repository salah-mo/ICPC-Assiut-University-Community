import java.util.Scanner;

/**
 * @author Salah
 */

public class J {

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double number1 = scan.nextDouble();
    double number2 = scan.nextDouble();
    double div12 = number1 / number2;
    double div21 = number2 / number1;

    if ((number1 > number2) && (div12 % 1 == 0))
    {
      System.out.println("Multiples");
    }
    else if ((number2 > number1) && (div21 % 1 == 0))
    {
      System.out.println("Multiples");
    } 
    else if (div21 == div12) 
    {
      System.out.println("Multiples");
    }
    else
    {
      System.out.println("No Multiples");
    }
  }
}
