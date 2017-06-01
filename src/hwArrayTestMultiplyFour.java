/**
 * Created by cad113 on 17. 5. 31.
 */
import java.util.Scanner;

public class hwArrayTestMultiplyFour {
    public static void main (String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please input your 1st array's row value. ");
        int firstArrayRow = inputReader.nextInt();
        System.out.println("Please input your 1st array's column value. ");
        int firstArrayColumn = inputReader.nextInt();

        int[][] arrayOne = new int[firstArrayRow][firstArrayColumn];
        System.out.println("Your arrays are " + firstArrayRow + " by " + firstArrayColumn);

        for (int rOne = 0; rOne < arrayOne.length; rOne++) {
            for (int cOne = 0; cOne < arrayOne[0].length; cOne++) {
                System.out.println("Please enter the array values.");
                int arrayValues = inputReader.nextInt();
                arrayOne[rOne][cOne] = arrayValues;
            }
        }
        System.out.println("Please input your 2nd array's row value. ");
        int secondArrayRow = inputReader.nextInt();
        System.out.println("Please input your 2nd array's column value. ");
        int secondArrayColumn = inputReader.nextInt();

        int[][] arrayTwo = new int[secondArrayRow][secondArrayColumn];
        System.out.println("Your arrays are " + secondArrayRow + " by " + secondArrayColumn);

        for (int rTwo = 0; rTwo < arrayTwo.length; rTwo++) {
            for (int cTwo = 0; cTwo < arrayTwo[0].length; cTwo++) {
                System.out.println("Please enter the array values.");
                int arrayValues = inputReader.nextInt();
                arrayTwo[rTwo][cTwo] = arrayValues;
            }
        }
        int[][] arrayThree = new int[arrayOne.length][arrayTwo[0].length];
        int sum = 0;
        for (int rThree = 0; rThree < arrayThree.length; rThree++) {
            for (int cThree = 0; cThree < arrayThree[0].length; cThree++) {
                for (int k = 0; k < arrayThree[0].length; k++) {
                    sum = sum + arrayOne[rThree][k] * arrayTwo[k][cThree];

                }
                arrayThree[rThree][cThree] = sum;
                sum = 0;
            }
        }
        for (int rThree = 0; rThree < arrayThree.length; rThree++) {
            for (int cThree = 0; cThree < arrayThree[0].length; cThree++) {
                System.out.println(arrayThree[rThree][cThree]);
            }
            System.out.println();
        }
    }
}
