import java.util.Scanner;

/**
 * @author Salah
 */

public class K {

  public static void main(String[] args)
  {
    //read 3 intgers numbers
    Scanner scan = new Scanner(System.in);
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    int number3 = scan.nextInt();
    
    //compare numbers 1,2 max and min numbers
    int max12 = Math.max(number1, number2);
    int min12 = Math.min(number1, number2);
  
    System.out.println(Math.min(number3, min12) + " " + Math.max(number3, max12));
  }
}
