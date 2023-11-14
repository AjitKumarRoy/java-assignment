//Write a program that prompts the user to input a positive integer.
//It should then output a message indicating whether the number is a prime number.

import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(n+" is neither prime not composite.");
            return;
        }

        //calling checkPrime function
        if (checkPrime(n)) {
            System.out.println(n+" is a prime number.");
        } else {
            System.out.println(n+" is not a prime number.");
        }

    }

    //function to check if the entered number is prime or not
    public static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}