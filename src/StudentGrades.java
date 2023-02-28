/**
 * @class: PrimeNumber
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 28, 2023
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        double grade=0;
        double min_grade=0;
        while(true){
        double input = 0;
        System.out.println("enter student grades:");
            try {
                input=in.nextDouble();
            }catch(InputMismatchException e){
                break;
            }
            grade = grade + input;
            min_grade +=1;
            double average = (double) grade / min_grade;
            System.out.println("Students average grade is:" + average);



        }
        }
    }

