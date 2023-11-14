//Write a program to calculate HCF of Two given number.

import java.util.*;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number : ");
        int a = sc.nextInt();
        System.out.print("Second Number : ");
        int b = sc.nextInt();

        //calling hcf function
        System.out.println("HCF : "+hcf(a,b));
    }

    //function to calculate the HCF of two number
    public static int hcf(int a, int b) {
        int first = Math.max(a,b);
        int second = Math.min(a,b);

        int rem = first % second;

        while (rem != 0) {
            first = second;
            second = rem;
            rem = first % second;
        }
        return second;
    }
}