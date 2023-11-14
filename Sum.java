
//Write a program that reads a set of integers, and then prints the sum of the even
//and odd integers

import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;

        int oddSum = 0;
        int evenSum = 0;

        while (n != 0) {
            System.out.print("Enter a number or '0' to exit : ");
            n = sc.nextInt();

            if (checkEven(n)) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }

        System.out.println("Sum of Odd Numbers : "+oddSum);
        System.out.println("Sum of Even Numbers : "+evenSum);
    }

    //function to check if the given number is even
    public static boolean checkEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}