//Write a program to print out all Armstrong numbers between 1 and 500.
//If sum of cubes of each digit of the number is equal to the number itself,
//then the number is called an Armstrong number.
//For example, 153 = (1*1*1) + (5*5*5) + (3*3*3)

import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        //printing all the Armstrong numbers between 1-500
        for (int i = 1; i <= 500; i++) {
            if (checkArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    //check if the entered number is armstrong or not
    public static boolean checkArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit*lastDigit*lastDigit;
            n /= 10;
        }
        return sum == originalNumber;
    }
}