//Write a do-while loop that asks the user to enter two numbers. The numbers
//should be added and the sum displayed. The loop should ask the user whether
//he or she wishes to perform the operation again. If so, the loop should repeat,
//otherwise it should terminate.

import java.util.*;
public class DoWhileLoop {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a,b;
     char ch = 'y';
     do {
         System.out.print("Enter a : ");
         a = sc.nextInt();
         System.out.print("Enter b : ");
         b = sc.nextInt();

         System.out.println("SUM : "+(a+b));

         System.out.print("Want to continue (y/n) : ");
         ch = sc.next().charAt(0);

         System.out.println();


     } while(ch != 'n');
    }
}