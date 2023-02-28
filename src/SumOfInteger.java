/**
 * @class: SumOfInteger
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 28, 2023
 */
import java.util.Scanner;
public class SumOfInteger {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter an integer");
         int i = in.nextInt();
        while(i != 0){
            sum = sum + i%10;
            i = i/10;
        }
        System.out.println("The sum of the integer is - " + sum);

    }
}
