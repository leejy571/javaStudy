/**
 * Created by cad211 on 6/17/17.
 */

import java.util.Scanner;
public class conditionalExerise5 {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Test Data\nInput number:");
        int input = s.nextInt();

        String [] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Expected Output :\n" + array[input -1]);

    }





    }



/*
5. Write a Java program that keeps a number from the user and generates an integer between 1
and 7 and displays the name of the weekday. Go to the editor
Test Data
Input number: 3
Expected Output :
Wednesday
Click me to see the solution
 */