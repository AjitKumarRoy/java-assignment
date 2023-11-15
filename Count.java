//Write a program to enter the numbers till the user wants and at the end it
//should display the count of positive, negative and zeroes entered.

import java.util.*;
public class Count {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     char choice = 'y';
     int positiveCount = 0;
     int negativeCount = 0;
     int zeroCount = 0;

     do {
         System.out.print("Enter a number : ");
         int a = sc.nextInt();

         if (a < 0) {
             negativeCount++;
         }
         else if (a > 0) {
             positiveCount++;
         }
         else {
             zeroCount++;
         }

         System.out.print("Do you want to enter another number (y/n) : ");
         choice = sc.next().charAt(0);
     } while (choice == 'y' || choice == 'Y');
     System.out.println("Counts : ");
     System.out.println("Positive Numbers : "+positiveCount);
     System.out.println("Negative Numbers : "+negativeCount);
     System.out.println("Zeroes : "+zeroCount);
    }
}