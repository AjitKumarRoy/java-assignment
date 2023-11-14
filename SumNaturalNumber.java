//Write a program to calculate the sum of first 10 natural number.

import java.util.*;
public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to calculate the sum : ");
        int n = sc.nextInt();
        //calling naturalNumberSum function
        System.out.println("Sum : "+naturalNumberSum(n));
    }

    //function to calculate the sum of Natural Numbers
    public static int naturalNumberSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}