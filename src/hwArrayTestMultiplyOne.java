/**
 * Created by cad113 on 17. 5. 31.
 */
public class hwArrayTestMultiplyOne {
    public static void main(String[] args) {
        int[][] arrayOne = {{0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14}
        };
        int[][] arrayTwo = {{2, 5, 2, 9, 1},
                {8, 4, 2, 0, 5},
                {9, 100, 88, 40, 0},
        };

        int sum = 0;
        int[][] arrayThree = new int[3][5];

        for (int row = 0; row < arrayThree.length; row++) {
            for (int column = 0; column < arrayThree[0].length; column++) {
                for (int k = 0; k < 3; k++) {
                    sum = sum + arrayOne[row][k] * arrayTwo[k][column];
                }
                arrayThree[row][column] = sum;
                sum = 0;
            }
        }

        for (int row = 0; row < arrayThree.length; row++) {
            for (int column = 0; column < arrayThree[0].length; column++) {
                System.out.println(arrayThree[row][column]);
            }
            System.out.println();
        }
    }
}