/**
 * Created by cad141 on 17. 5. 27.
 */

import java.util.Scanner;

public class hwArrayTestFour {
    public static void main (String[] args) {
        Scanner importLetter = new Scanner (System.in);
        System.out.println("Please enter the row value ");
        int rowInput = importLetter.nextInt();
        System.out.println("Please enter the column value ");
        int columnInput = importLetter.nextInt();
        int [][] arrayInput = new int[rowInput][columnInput];

        int [] [] arrayThree = new int[3][5];

        for (int r = 0; r < arrayThree.length; r++) {
            for (int c = 0; c < arrayThree[0].length; c++) {
                System.out.println("Please enter the row");
                int rowInputCustomizedRow = importLetter.nextInt();
                System.out.println("Please enter the colum");
                int rowInputCustomizedColum = importLetter.nextInt();
                System.out.println(arrayThree[r][c]);
            }
        }


    }
}
