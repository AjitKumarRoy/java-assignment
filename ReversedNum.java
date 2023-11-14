//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the
//output should be 54321.

import java.util.*;
public class ReversedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();

        //calling reversedNum function
        System.out.println("Reversed integer : "+reversedNum(num));
    }

    //function to print the reversed number
    public static int reversedNum(int n) {
        int reversed = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }
        return reversed;
    }
}