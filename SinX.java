//Write a program to compute sinx for given x. The user should supply
//x and a positive integer n. We compute the sine of x using the series and
//the computation should use all terms in the series up through the term involving
//x^n
//sinx = x - x^3/3! + x^5/5! - x^7/7! + x^9/9!....

import java.util.Scanner;

public class SinX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x in degrees: ");
        double degrees = sc.nextDouble();
        double x = Math.toRadians(degrees); // Convert degrees to radians
        System.out.print("Enter n : ");
        int n = sc.nextInt(); // Number of terms

        double sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        System.out.println("Sin(" + degrees + " degrees) : " + sum);
    }

    // Function to calculate factorial using long data type
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}


