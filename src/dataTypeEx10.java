/**
 * Created by cad113 on 6/13/17.
 */

import java.util.Scanner;

public class dataTypeEx10 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }
}

/*
        for (int k = 0; k < length; k++) {
            for (int i = length; i >= 0; i--) {
                double[][] array = new double[0][(2 * length)];
                output = (input / (Math.pow(10, length)));
                double finalInput = input / output;
                //array[0][k] = input / output;
                System.out.println(finalInput);
            }
        }
*/


/*
        for (int row = 0; row < arrayThree.length; row++) {
            for (int column = 0; column < arrayThree[0].length; column++) {
                for (int k = 0; k < arrayTwo[0].length; k++) {
                    sum = sum + arrayOne[row][k] * arrayTwo[k][column];

                }
                arrayThree[row][column] = sum;
                sum = 0;
            }
        }
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
            for (int rTwo = 0; rTwo < arrayTwo.length; rTwo++) {
                for (int cTwo = 0; cTwo < arrayTwo[0].length; cTwo++) {
                    System.out.println(arrayTwo[rTwo][cTwo]);
                }
                System.out.println();
            }
              for(int i = length; i >= 0; i --){
            for (int k = 0; k < length; k ++) {
                double output;
                output = (input / (Math.pow(10, length)));
                double[][] array = new double[0][(2 * length)];
                array[0][k] = input / output;
                System.out.println(array[0][k]);
            }
        }
 */