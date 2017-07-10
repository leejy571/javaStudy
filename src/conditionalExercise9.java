/**
 * Created by cad113 on 6/27/17.
 */
import java.util.Scanner;
public class conditionalExercise9 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Test Data\nInput the year: ");
        int year = s.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year %100 != 0) {
            System.out.println("Expected Output :\n" + year +" is a leap year");
        }
        else {
            System.out.println("Expected Output :\n" + year +" is a regular year");
        }
    }
}

/*
9. Write a Java program that takes a year from user and print whether that year is a leap year or not. Go to the editor

Test Data
Input the year: 2016
Expected Output :
2016 is a leap year
 */