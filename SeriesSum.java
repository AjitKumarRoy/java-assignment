//Write a program to calculate the sum of following series where n is input by
//user
//1 + 1/2 + 1/3 + 1/4 + 1/5 +......1/n

import java.util.*;
public class SeriesSum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter n : ");
     int n = sc.nextInt();
     float sum = 0;

     for (int i = 1; i <= n; i++) {
         sum += 1f/i;
     }
     System.out.println("Sum : "+sum);
    }
}