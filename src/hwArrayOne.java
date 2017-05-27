/**
 * Created by cad211 on 17. 5. 27.
 */

import java.util.Arrays;
import java.util.Scanner;

public class hwArrayOne {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the row value.");
        int inputRow = userInput.nextInt();
        System.out.println("Please enter the column value.");
        int inputColumn = userInput.nextInt();
        int [][] arrayInput = new int [inputRow][inputColumn];

        for (int r = 0; r < arrayInput.length; r++) {
            for (int c = 0; c < arrayInput[0].length;c ++) {
                System.out.println("Please enter your value");
                arrayInput[r][c] = userInput.nextInt();
            }
        }
        System.out.println(Arrays.toString(arrayInput));




    }
}


