/**
 * Created by cad113 on 6/12/17.
 */

import java.util.Scanner;
public class dataTypeEx6 {
    public static void main (String[] args) {
        System.out.println("Please enter your weight.");
        Scanner s = new Scanner (System.in);
        int inputWeight = s.nextInt();
        double weight = inputWeight * 0.45;
        System.out.println("Please enter your height.");
        int inputHeight = s.nextInt();
        double height = Math.pow((inputHeight * 0.025), 2);
        double bmi = weight / height;
        System.out.println("Your BMI is ." + bmi);


    }
}


/*
6. Write a Java program to compute body mass index (BMI). Go to the editor

Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output :
Body Mass Index is 61.30159143458721
 */