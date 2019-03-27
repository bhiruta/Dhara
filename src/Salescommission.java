import java.util.Scanner;

public class Salescommission {
    public static void main(String[] args) {

        int main;
        float salesid, sellername, salesamount, sales = 0, basicsalry, salescommission;
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        //constants for range limits
        double level1_limit = 50000;
        double level2_limit = 30000;
        double level3_limit = 20000;
        double level4_limit = 10000;
        double level5_limit = 10000;
        // constants for commission rates
        double level1_rate = 35;
        double level2_rate = 20;
        double level3_rate = 10;
        double level4_rate = 5;
        double level5_rate = 2;
        //prompt user for sales amount
        System.out.print("Enter sales amount :");

        double rates = 0; // initialize commission rate

        //determine interest commission rate based on sales amount
        if (0 >= sales) {
            rates = 0;
        } else if (sales > level1_limit) {
            rates = level1_rate;

        } else if (sales > level2_limit) {
            rates = level2_rate;
        } else if (sales > level3_limit) {
            rates = level3_rate;
        } else if (sales > level4_limit) {
            rates = level4_rate;

        } else {
            rates = level5_rate;

        }

    }


}


    
