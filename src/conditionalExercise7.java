/**
 * Created by cad211 on 6/17/17.
 */

import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class conditionalExercise7 {
        public static void main (String[]args){
<<<<<<< HEAD
        Scanner s = new Scanner(System.in);
        System.out.println("Test Data\nInput a month number:");
        int month = s.nextInt();
        System.out.println("Input a Year");
        int year = s.nextInt();
        System.out.println(YearMonth.of(year, month));
=======
                Scanner s = new Scanner(System.in);
                System.out.println("Test Data\nInput a month number:");
                int month = s.nextInt();
                String[] monthArrays = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                System.out.println("Input a Year");
                int year = s.nextInt();
                int day = 1;

                Calendar c = new GregorianCalendar(year, month, day);
                int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
                System.out.println(monthArrays[month] + " " + year + " has "+ daysInMonth + " days.");

>>>>>>> eecfca6422c106b103e540d90d458680cb5b435b

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