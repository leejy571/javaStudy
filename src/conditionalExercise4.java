/**
 * Created by cad211 on 6/14/17.
 */
import java.util.Scanner;
public class conditionalExercise4 {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Test Data\nInput value:");
        int input = s.nextInt();

        if(Math.abs(input) < 1) {
            System.out.println("small");
        }
        else if (Math.abs(input) > 1000000) {
            System.out.println("large");
        }

        if (input > 0) {
            System.out.println("Positive number.");
        }
        else if (input < 0) {
            System.out.println("Negative number.");
        }
        else if (input == 0) {
            System.out.println("Zero.");
        }


    }
}

/*
4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
or "large" if it exceeds 1,000,000. Go to the editor

Test Data
Input value: 25
Expected Output :
Positive number

Click me to see the solution
 */