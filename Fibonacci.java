//Write a program to print the Fibonacci series of n terms where n is input
//by user:
//0 1 1 2 3 5 8 13 24.....

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //calling fibonacci function
        fibonacci(arr,n);

        //printing fibonacci numbers
        System.out.print("Fibonacci Numbers : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    //function to store the Fibonacci series upto n terms
    public static void fibonacci(int arr[], int n) {
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
    }
}