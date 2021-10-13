// In this program, we find the ASCII value of a character and display it.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please add a character you want to see the ASCII code: ");
        char ch = scan.next().charAt(0);
         //In Scanner class to read a char, we use next().charAt(0).
         //next() function returns the next token in the input as a string and
         // charAt(0) function returns the first character in that string.

        int ascii = ch;
        // If we direct assign char variable to int,
        // it will return ASCII value of given character.

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}