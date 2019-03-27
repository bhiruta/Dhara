import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Employeeid {


    public static void main(String[] args) {
        int main;
        float HRA;
        {
            Scanner scn=new Scanner (System.in);

            float Basic=0;
            float DA;
            float TA;
            float PF;


            System.out.println ("Please enter the basic salary of an employee  :");
            if (Basic <= 10000) {
                HRA=(Basic * 10 / 100);
                DA=(Basic * 8 / 100);
                TA=(Basic * 9 / 100);
                PF=(Basic * 20 / 100);

            } else
                HRA=(Basic * 20 / 100);
            DA=(Basic * 16 / 100);
            TA=(Basic * 18 / 100);
            PF=(Basic * 20 / 100);

            float Gross_Salary;
            Gross_Salary=Basic+DA+HRA+TA+PF;

        }System.out.println("Gross salary of this employee = %.2f ");


    }


    }


