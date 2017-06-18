/**
 * Created by cad211 on 6/17/17.
 */

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;
public class conditionalExercise7 {

        public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Test Data\nInput a month number:");
        int month = s.nextInt();
        System.out.println("Input a Year");
        int year = s.nextInt();

        System.out.println(YearMonth.of(year, month));

        }
}




/*
7. Write a Java program to find the number of days in a month. Go to the editor
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
 */