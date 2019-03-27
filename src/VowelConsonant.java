import java.util.Scanner;

public class VowelConsonant {
    public static void main (String  [] args){

        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);

        System.out.println("Please enter the alphabet");
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + "is vowel");

        }else
            System.out.println(ch + "is consonant");
    }

    
}
