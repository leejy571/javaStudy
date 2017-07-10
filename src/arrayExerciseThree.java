/**
 * Created by cad211 on 7/5/17.
 */
import java.util.Scanner;
import java.util.Arrays;
public class arrayExerciseThree {
    public static void main (String[] args) {
        System.out.println("Please enter the row value of the array.");
        Scanner s = new Scanner (System.in);
        int row = s.nextInt();
        System.out.println("Please enter the column value of the array.");
        int column = s.nextInt();
        String [][] arrayOne = new String [row][column];
        String input = "-";
        for (int rowCtr = 0; rowCtr < row; rowCtr++) {
            for (int columnCtr = 0; columnCtr < column; columnCtr ++ ) {
                arrayOne[rowCtr][columnCtr] = input;
            }
        }
        for (int rowCtr = 0; rowCtr < row; rowCtr++) {
            for (int columnCtr = 0; columnCtr < column; columnCtr ++ ) {
                arrayOne[rowCtr][columnCtr] = input;
            }
            System.out.println(arrayOne[row][column]);
        }





    }
}

/*
3. Write a Java program to print the following grid. Go to the editor

Expected Output :

- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
 */