import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial : ");
        int n = sc.nextInt();

        //calling factorial function
        System.out.println(factorial(n));
    }

    //function to find the factorial of any entered number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n-1);
    }
}