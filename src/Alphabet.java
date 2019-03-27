import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter alphabet :");
        char ch = scn.next().charAt(0);

        if (ch == 'a' || ch == 'A') {
            System.out.println("Ahmedabad city ");

        } else if (ch == 'b' || ch == 'B') {
            System.out.println("Baroda city ");

        } else if (ch == 'c' || ch == 'C') {
            System.out.println("Calcutta city ");

        } else if (ch == 'd' || ch == 'D') {
            System.out.println("Denmark city");
        } else if (ch == 'e' || ch == 'E') // both uppercase and lowercase letter should be acceptable.
        {
            System.out.println("England city");
        } else if (ch == 'f' || ch == 'F') {
            System.out.println("France city");
        } else {
            System.out.println("In valid city");
        }

    }

}



