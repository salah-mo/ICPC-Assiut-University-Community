import java.util.Scanner;

/**
 * @author Salah
 */

//Note:         ASCII code
//
//Digits in ASCII '0' = 48,'1' = 49 ....etc
//Capital letters in ASCII 'A' = 65, 'B' = 66 ....etc
//Small letters in ASCII 'a' = 97,'b' = 98 ....etc

public class M {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char input = scan.next().charAt(0);

        if (input >= '0' && input <= '9')
        {
            System.out.println("IS DIGIT");
        }
        else if (input >= 'A' && input <= 'Z')
        {
            System.out.println("ALPHA\n" + "IS CAPITAL");

        }
        else if (input >= 'a' && input <= 'z')
        {
            System.out.println ("ALPHA\n" + "IS SMALL");
        }
    }
}
