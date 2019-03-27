import java.util.Scanner;

public class Number {
    public static void main(String [] args){
        int main
                ;
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        System.out.println("Please enter any character :");

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Is an Alphabet ");//(ch >='A' && Ch <='Z')

        }else if (ch >= '0' && ch <= '9') {
            System.out.println("Is a number");

        }else
            System.out.println("Is not an alphabet, or a number ");

    }
}
