import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Add a integer value");
        int i = scan.nextInt();
        boolean test= false;

        for(int a=2; a<i/2; a++) {
            if(i%a==0) {
                test = true;
                break;
            }
        }
        if(test==true && i%2==0) {System.out.println(i+" is a not prime and even number!");}

        else if (test==true && i%2==1) {System.out.println(i+" is a not prime and odd number!");}

        else if(test==false && i%2==0) {System.out.println(i+" is a prime and even number!");}

        else if(test==false && i%2==1) {System.out.println(i+" is a prime and odd number!");}

    }

    }
