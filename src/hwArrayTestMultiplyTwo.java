/**
 * Created by cad113 on 17. 5. 31.
 */
public class hwArrayTestMultiplyTwo {
    public static void main(String[] args) {
        int[][] arrayOne = {{1, 2},
                {3, 4},
        };
        int[][] arrayTwo = {{3, 1},
                {2, 5},
        };

        int[][] arrayThree = new int[2][2];
        int sum = 0;

        for (int row = 0; row < arrayThree.length; row++) {
            for (int column = 0; column < arrayThree[0].length; column++) {
                for (int k = 0; k < arrayTwo[0].length; k++) {
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
            System.out.println("");
        }
    }
}
