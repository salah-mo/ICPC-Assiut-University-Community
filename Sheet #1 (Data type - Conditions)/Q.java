import java.util.Scanner;

/**
 * @author Salah
 */

public class Q {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        if (number1 == 0 && number2 == 0)
        {
            System.out.println("Origem");
        }

        else if(number1 == 0 && number2 !=0  )
        {
            System.out.println("Eixo Y");
        }

        else if(number2 == 0 && number1 != 0 )
        {
            System.out.println("Eixo X");
        }

        else
        {
            if (number1 > 0 && number2 > 0)
            {
                System.out.println("Q1");
            }

            if (number1 < 0 && number2 > 0)
            {
                System.out.println("Q2");
            }

            if (number1 < 0 && number2 < 0)
            {
                System.out.println("Q3");
            }

            if (number1 > 0 && number2 < 0)
            {
                System.out.println("Q4");
            }
        }
    }
}
