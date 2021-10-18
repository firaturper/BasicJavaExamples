import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Add a Number For Sum and Factorial: ");
        int number = scan.nextInt();
        int sum = addNums(number);
        int factorial = multiplyNums(number);
        System.out.println("Sum = " + sum);
        System.out.println("Factorial = " + factorial);
    }
    //A method that calls itself in Java is called a recursive method.
    public static int addNums(int num) { // This method is for sum.
        if (num != 0)
            return num + addNums(num - 1);
        else
            return num;
    }
    public static int multiplyNums(int num)  // This method is for Factorial.
    {
        if (num >= 1)
            return num * multiplyNums(num - 1);
        else
            return 1;
    }
}
