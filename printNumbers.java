//Write a program to print numbers form 1 to 10;

import java.util.*;
public class printNumbers {
    public static void main(String[] args) {
        //calling printNaturalNumbers function

        printNaturalNumbers(10);
    }

    //function to print Natural numbers
    public static void printNaturalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            //printing numbers
            System.out.println(i);
        }
    }
}