import java.util.Scanner;

public class Interchangevalue {
    public static Scanner sc;

    public static void main (String [] args){
        int a, b, temp;
        sc = new Scanner (System.in);
        System.out.println("please rnter the first value ");
        a = sc.nextInt();

        System.out.println("please enter the second value ");
        b = sc.nextInt();

        System.out.println("/n before swapping: a = "+ a + " and b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("/n after swapping: a = " + a + " and b = " + b);


    }
}
