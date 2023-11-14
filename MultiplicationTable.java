//Write a program that prompts the user to input a positive integer.
//It should then print the multiplication table of that number.

import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a +ve number to print it's multiplication table : ");
        int n = sc.nextInt();

        //calling multiplicationTable function
        multiplicationTable(n);
    }

    //function to print the multiplication table
    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}