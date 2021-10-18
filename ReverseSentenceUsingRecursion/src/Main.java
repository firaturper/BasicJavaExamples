// This code is reverse a sentence using recursion
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Add a Sentence: ");
        String sentence = scan.next();
        String reversed = reverse(sentence);
        System.out.println("Result is: " + reversed);

    }

    private static String reverse(String sentence) {
        if (sentence.isEmpty())
            return sentence;

            return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}
