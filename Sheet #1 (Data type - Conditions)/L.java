import java.util.Scanner;

/**
 * @author Salah
 */
public class L {

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String fristName1 = scan.next();
    String lastName1 = scan.next();
    String fristName2 = scan.next();
    String lastName2 = scan.next();
    scan.close();

    String name1 = fristName1 + " " + lastName1;
    String name2 = fristName2 + " " + lastName2;

    if ((name1.endsWith(lastName2)) && (name2.endsWith(lastName1)))
    {
      System.out.println("ARE Brothers");
    }
    else
    {
      System.out.println("NOT");
    }
  }
}
