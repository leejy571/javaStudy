/**
 * Created by cad113 on 6/27/17.
 */
import java.util.Scanner;
public class conditionalExercise11 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Test Data\nInput the number: ");
        int input = s.nextInt();
        int sum = 0;
        System.out.println("The first n natural numbers are :\n" +input);
        for (int i = 0; i < input; i ++) {
            sum += i + 1;
            System.out.println(i + 1);

        }
        System.out.println("The Sum of Natural Number upto n terms :\n" + sum);
    }
}

/*
11. Write a program in Java to display n terms of natural numbers and their sum. Go to the editor

Test Data
Input the number: 2
Expected Output :

Input number:
2
The first n natural numbers are :
2
1
2
The Sum of Natural Number upto n terms :
23q
Click me to see the solution.
 */