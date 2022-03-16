import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Salah
 */

public class E {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double input = scan.nextDouble();
    if (input >= 1 && input <= 100) {
      String formating = "#.#########";
      double result = Math.PI * Math.pow(input, 2);

      DecimalFormat numberFormat = new DecimalFormat(formating);
      System.out.println(numberFormat.format(result));
    }
  }
}
