import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Number You Want To Know The Factorial Value");
        int num = scan.nextInt();
        int factor = 1;
        for(int i=1; i<=num; ++i) {

            factor = factor*i;
        }

        System.out.println("Result is "+ factor);
    }
}
