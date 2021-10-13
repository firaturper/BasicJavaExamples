// This code checks for prime, odd or even numbers
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Add a Number: ");
        Boolean primeNum = true;
        int num = scan.nextInt();

        if(num%2==0) {System.out.print("Number is Even and ");}
        else {System.out.print("Number is Odd and ");}
        for(int i=2; i<=num/2; i++) {
            if(num%i==0) {
                primeNum = false;
                break;
            }
        }

        if(!primeNum) {System.out.print("not Prime");}
        else {System.out.print("Prime");}
    }
}
