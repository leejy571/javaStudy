/**
 * Created by cad211 on 7/5/17.
 */

import java.util.Scanner;
import java.util.Arrays;
public class arrayExerciseFour {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int [] arrayOne = new int [5];
        int sum = 0;

        for (int ctr = 0; ctr < 5; ctr ++) {
            System.out.println("Please enter the value.");
            arrayOne[ctr] = s.nextInt();
            sum = sum + arrayOne[ctr];
        }

        double average = sum /(arrayOne.length);
        System.out.println("The sum of the value is " + sum+ ". The average is " +average);
    }
}


/*
4. Write a Java program to calculate the average value of array elements. Go to the editor

Click me to see the solution
 */