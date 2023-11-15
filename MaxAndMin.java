//Write a program to enter the numbers till the user wants and at the end the
//program should display the largest and smallest numbers entered.

import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int max = Integer.MIN_VALUE;
     int min = Integer.MAX_VALUE;

     char choice = 'y';

     do {
         System.out.print("Enter a number : ");
         int a = sc.nextInt();
         max = Math.max(max, a);
         min = Math.min(min,a);

         System.out.print("Do you want to enter another number (y/n) : ");
         choice = sc.next().charAt(0);
     } while (choice == 'y' || choice == 'Y');
     System.out.println("Maximum Number : "+max);
     System.out.println("Minimum Number : "+min);
    }
}