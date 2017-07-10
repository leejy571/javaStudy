/**
 * Created by cad113 on 6/18/17.
 */
import java.util.Scanner;
public class conditionalExercise8 {
    public static void main(String[] args) {
        System.out.println("Test Data\nInput an alphabet:");
        Scanner s = new Scanner(System.in);
        String i = s.next();

        if (inputValidationStringOnly(s, i) == false){
            System.out.println("Your imput must be a letter.");
        }
        else if (inputValidationLetterCount(i) == false) {
            System.out.println("Your input must be a single letter.");
        }
        else if (inputValidationStringOnly(s, i) == true && inputValidationLetterCount(i) == true) {
            System.out.println("Expected Output :\nInput letter is" + cOrV(i));
        }
    }
    static boolean inputValidationLetterCount(String i) {

        if (i.length() == 1) {
            return true;
        }
        else if (i.length() > 1) {
            return false;
        }
        else return false;
    }
    static boolean inputValidationStringOnly(Scanner input, String i) {
        if (!input.hasNextInt()) {
            return true;
        }
        else if (input.hasNextInt()) {
            return false;
        }
        else return false;
    }
    static String cOrV (String i) {
        if (i.equals("a") || i.equals("e") || i.equals("i") || i.equals("o") || i.equals("u")) {
            return "Vowel";
        }
        else return "Constant";
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

else if (s.hasNextInt()) {
            System.out.println("Your input must be a letter.");
        }
package vowelConsonant;
02
import java.util.Scanner;
03
import java.io.*;
04
public class VowCon
05
{
06
    public static void main(String[] args)
07
    {
08
        // TODO Auto-generated method stub
09

10
        String inString = new String("");
11
        System.out.print("Enter letter: ");// get the input from the user
12
        Scanner sc = new Scanner(System.in);
13
        inString = sc.nextLine();
14

15
        if (inString.length() != 1)
16
        {
17
            System.out.println("Invalid entry.");
18
        }
19
        else if ((inString.compareTo("a") >= 0 && inString.compareTo("z") <= 0) || (inString.compareTo("A") >=  0 && inString.compareTo("Z") <= 0))
20
        {
21
            if (inString.equals("a") || inString.equals("e") || inString.equals("i") || inString.equals("o") || inString.equals("u"))
22
            {
23
                System.out.println("Thank you for the vowel " + inString);
24
            }
25
            else if (inString.equals("A") || inString.equals("E") || inString.equals("I") || inString.equals("O") || inString.equals("U"))
26
            {
27
                System.out.println(inString + " is a vowel. ");
28
            }
29
            else
30
            {
31
                System.out.println(inString + " is a consonant. ");
32
            }
33
        }
34
        else
35
        {
36
            System.out.println("Not a letter.");
37
        }
38
    }
39
}


 */