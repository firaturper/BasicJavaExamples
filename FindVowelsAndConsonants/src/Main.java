//Find vowels and consonants in the alphabet in Turkish
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Add a Letter/Lütfen Bir Harf Giriniz: ç");
        char letter = scan.next().charAt(0);

        switch(letter) {
            case 'a':
            case 'e':
            case 'ı':
            case 'i':
            case 'o':
            case 'ö':
            case 'u':
            case 'ü':
                System.out.println(letter + " is vowel/sesli harftir.");
                break;
            default:
                System.out.println(letter + " is consonant/sessiz harftir.");
        }
    }
}