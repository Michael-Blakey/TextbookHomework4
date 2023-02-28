/**
 * @class: PrimeNumber
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 28, 2023
 */
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number between 1 and 100:");
        int number = in.nextInt();
       boolean prime = number > 1;
       for(int n = 2; n < number; n++){
           if (number % n == 0){
               prime = false;
               }
           }
        if (prime){
            System.out.println( number + " is a prime number.");
        }else{
            System.out.println( number + " number is not a prime number.");



            }

        }






    }






