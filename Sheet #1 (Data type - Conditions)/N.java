import java.util.Scanner;

/**
 * @author Salah
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char input = scan.next().charAt(0);

        if (input >= 'A' && input <= 'Z')
        {
            System.out.println(Character.toLowerCase(input));
        }
        else
        {
            System.out.println(Character.toUpperCase(input));
        }
    }
}
