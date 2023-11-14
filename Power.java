//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another.(Do not use Java built-in method)

import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter power : ");
        int power = sc.nextInt();

        //calling power function
        System.out.println(base+"^"+power+" = "+power(base, power));
    }

    //function to calculate any power of any number
    public static int power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return base;
        }

        int half = power(base,power/2);

        //for even power
        if (checkEven(base)) {
            return half*half;
        }

        //for odd power;
        return base * half * half;
    }


    //function to check odd/even
    public static boolean checkEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}