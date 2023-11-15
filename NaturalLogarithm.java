//Compute the natural logarithm of 2, by adding up to n terms in the series
//1-1/2+1/3-1/4+1/5-...1/n
//where n is a positive integer and input by user

import java.util.*;
public class NaturalLogarithm {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a positive integer : ");
     int n = sc.nextInt();
     float sum = 0;

     for (int i = 1; i <=n; i++) {
         if (i%2 == 0) {
             sum -= 1f/i;
         } else {
             sum += 1f/i;
         }
     }
     System.out.println("Natural logarithm of 2 for (n="+n+") :"+sum);
    }
}