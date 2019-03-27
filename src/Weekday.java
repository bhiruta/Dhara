import java.util.Scanner;

public class Weekday {
    public static void main(String [] args){
        {
            int main;
            int weekday = 0;

            
            System.out.println("Please enter the day number 1 to 7 (consider 1= Monday, and 7= Sunday) :");

             if ( weekday == 1){
                System.out.println("Monday");

            } else if (weekday == 2) {
                System.out.println("Tuesday");

            }else if (weekday == 3) {
                System.out.println("Wednesday");

            }else if (weekday ==4) {
                System.out.println("Thursday");
            }else if (weekday == 5) {
                System.out.println("Friday");
            }else if (weekday == 6) {
                System.out.println("Saturday");
            }else if (weekday == 7) {
                System.out.println("Sunday");
            } else
                System.out.println("Please enter number between 1 to 7");


        }



    }
}




