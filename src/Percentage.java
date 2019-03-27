import java.util.Scanner;

public class Percentage {
    private static Scanner sc;

    public static void main(String[] args) {
        int maths, english, science;
        float total, pass, fail, percentage, grade;
        sc = new Scanner(System.in);

        System.out.println("please enter the three subjects marks :");
        maths = sc.nextInt();
        english = sc.nextInt();
        science = sc.nextInt();

        total = maths + english + science;
        percentage = (total / 300);

        System.out.println("TOTAL marks " + total);
        System.out.println(" Marks percentage" + percentage);
        System.out.println("Grade A+ , Grade A , Grade B , Grade c" );


    }

}























