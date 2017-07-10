/**
 * Created by cad113 on 6/27/17.
 */

import java.util.Scanner;

public class conditionalExercise8a {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Test Data\nInput an alphabet: ");
        String input = s.next();

        boolean vowel = input.equals("a");

        if (vowel) {
            System.out.println("Vowel");
        }

    }
}


/*
8. Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel or Consonant, depending on the user input.
 If the user input is not a letter (between a and z or A and Z),
 or is a string of length > 1, print an error message. Go to the editor

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant

Click me to see the solution
 */