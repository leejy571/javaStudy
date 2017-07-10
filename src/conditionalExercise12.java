/**
 * Created by cad211 on 6/27/17.
 */
import java.util.Scanner;
public class conditionalExercise12 {
    public static void main (String[] args) {
        System.out.println("Input the 5 numbers : ");
        Scanner sc = new Scanner (System.in);
        int [] array = new int [5];

        for (int ctr = 0; ctr < 5; ctr ++) {
            int input = sc.nextInt();
            array [ctr] = input;

        }
        System.out.println(array);

    }
}


/* 12. Write a program in Java to input 5 numbers from keyboard and find their sum and average.
Go to the editor
Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0
Click me to see the solution
*/