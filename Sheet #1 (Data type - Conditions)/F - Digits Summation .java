import java.util.Scanner;

/**
 * @author Salah
 */

public class F {

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    long number1 = scan.nextLong();
    long number2 = scan.nextLong();
    String number1ToString = Long.toString(number1);
    String number2ToString = Long.toString(number2);
    String finalNumber1 = number1ToString.substring(number1ToString.length() - 1);
    String finalNumber2 = number2ToString.substring(number2ToString.length() - 1);
    int finalNumber1toInt = Integer.parseInt(finalNumber1);
    int finalNumber2toInt = Integer.parseInt(finalNumber2);

    System.out.println(finalNumber1toInt + finalNumber2toInt);
  }
}
