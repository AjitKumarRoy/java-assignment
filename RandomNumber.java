//Write a program that generates a random number and asks the user to guess
//what the number is. If the user's guess is higher than the random number, the
//program should display "Too high, try again." If the user's guess is lower
//than the random number, the program should display "Too low, try again." The
//program should use a loop that repeats until the user correctly guesses the
//random number.


import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //it will generate random number from 0 to 99+1
        int a = random.nextInt(100)+1;

        System.out.println("Guess the Number from 0 to 100 : ");
        while (true) {
            int b = sc.nextInt();
            if (b == a) {
                break;
            }
            else if (b > a) {
                System.out.println("Too high, try again.");
            }
            else {
                System.out.println("Too low, try again.");
            }
        }
        System.out.println("Correct!!");
    }
}