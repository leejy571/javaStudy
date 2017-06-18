/**
 * Created by cad211 on 6/17/17.
 */
import java.util.Scanner;

public class conditionalExercise6 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Test Data\nInput floating-point number:");
        float first = s.nextFloat();
        System.out.println("Input floating-point another number:");
        float second = s.nextFloat();
        System.out.println("Expected Output:");

        if(first == second) {
            System.out.println("They are same.");
        }
        else if(first != second) {
            System.out.println("They are different.");
        }
    }

}


/*
6. Write a Java program that reads in two floating-point numbers and tests whether they are the
same up to three decimal places. Go to the editor
Test Data
Input floating-point number: 1256
Input floating-point another number: 3254
Expected Output :
They are different
 */