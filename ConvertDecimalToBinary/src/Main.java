// This code converts decimal to binary number
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Please Add a Number: ");

    int decimal = scan.nextInt();
    String binary = Integer.toBinaryString(decimal);
    System.out.println("Decimal Number: "+decimal);
    System.out.println("Binary Number: "+binary);

    }
}
