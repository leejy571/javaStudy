/**
 * Created by cad141 on 17. 5. 27.
 */
public class hwArrayTestOne {
    public static void main (String[] args) {
        int [] [] arrayOne = {  {0,1,2,3,4},
                                {5,6,7,8,9},
                                {10,11,12,13,14}
                            };
        int [][] arrayTwo = {   {2,5,2,9,1},
                                {8,4,2,0,5},
                                {9,100,88,40,0},

                            };

        for(int c = 0; c < arrayOne.length && c < arrayTwo.length; c++) {
            for (int r = 0; r < arrayOne[0].length && r < arrayTwo[0].length; r++) {
                int [] [] arrayThree = new int[3][5];
                arrayThree [c][r] = arrayOne [c][r] + arrayTwo [c][r];
                System.out.println(arrayOne[c][r] + " + " + arrayTwo[c][r] + " = " + arrayThree[c][r]);

            }
        }


    }
}
