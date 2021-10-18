// This code shows all upper and lower case letters in the alphabet.
public class Main {

    public static void main(String[] args) {


        for(char lower='a';lower<='z';++lower) {
            //lowercase letters are selected from the ASCII code
            System.out.print(lower+"-");
        }
        System.out.println();
        System.out.println("****************************************************");
        for (char upper='A';upper<='Z';++upper) {
            //uppercase letters are selected from the ASCII code
            System.out.print(upper+"-");
        }
    }
}
