import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Salah
 */

public class E {

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double R = scan.nextDouble();
    if (R >= 1 && R <= 100)
    {
      String formating = "#.#########";
      double  area = Math.PI * Math.pow(R , 2);

      DecimalFormat numberFormat = new DecimalFormat(formating);
      System.out.println(numberFormat.format(area));
    }
  }
}
