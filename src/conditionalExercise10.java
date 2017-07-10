/**
 * Created by cad113 on 6/27/17.
 */

import java.util.Scanner;
public class conditionalExercise10 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Expected Output :");
        int naturalNumb = s.nextInt();
        System.out.println("The first "+ naturalNumb +" natural numbers are:");
        for(int i = 0; i < naturalNumb; i++) {
            System.out.println(i + 1);
        }


    }
}

/*
10. Write a program in Java to display the first 10 natural numbers. Go to the editor

Expected Output :

The first 10 natural numbers are:

1
2
3
4
5
6
7
8
9
10
Click me to see the solution
 */