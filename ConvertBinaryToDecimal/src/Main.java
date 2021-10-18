// This code converts binary number to decimal
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Add a Binary Number: ");
        String binaryNumber = scan.next();

            int decimalNumber = Integer.parseInt(binaryNumber, 2);
            System.out.println("Binary Number is: " + binaryNumber);
            System.out.println("Decimal Number is: " + decimalNumber);
    }
}
