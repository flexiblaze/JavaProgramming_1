package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;


        for (int i = 1; i <6 ; i++) {
            System.out.println("enter a number");
            int num = scan.nextInt();


            if (num> max){ // if the user entered number is greater than current maximum number

                max = num;
            }

        }

        System.out.println("max = " + max);








    }
}
