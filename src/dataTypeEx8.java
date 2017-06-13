/**
 * Created by cad113 on 6/13/17.
 */

import java.util.Scanner;
public class dataTypeEx8 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your input.");
        double input = s.nextInt();
        double square = Math.pow(input, 2);
        double cube = Math.pow(input, 3);
        double fourthPower = Math.pow(input, 4);
        System.out.println("Expected Output:\nSquare: " + square + "\nCube: " + cube + "\nFourth power: " + fourthPower);
    }
}
/*

8. Write a Java program that reads a number and display the square, cube, and fourth power. Go to the editor

        Expected Output :
        Square: .2f
        Cube: .2f
        Fourth power: 50625.00
        Click me to see the solution

import java.util.Scanner;
public class Exercise8 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
    }
}

        */