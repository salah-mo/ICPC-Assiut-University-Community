import java.util.Scanner;

/**
 * @author Salah
 */

public class P {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
      
        int out = input / 1000;
        if (out % 2 == 0) 
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }

    }
}
