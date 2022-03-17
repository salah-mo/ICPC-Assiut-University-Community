import java.util.Scanner;

/**
 * @author Salah
 */

public class G {

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    long num = scan.nextLong();
    System.out.println((num * (num + 1) / 2));
  }
}
