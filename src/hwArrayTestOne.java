/**
 * Created by cad141 on 17. 5. 27.
 */
import java.util.Arrays;
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
        int [] [] arrayThree = new int[3][5];

        for(int c = 0; c < arrayOne.length && c < arrayTwo.length; c++) {
            for (int r = 0; r < arrayOne[0].length && r < arrayTwo[0].length; r++) {
                arrayThree [c][r] = arrayOne [c][r] + arrayTwo [c][r];
                System.out.println(arrayOne[c][r] + " + " + arrayTwo[c][r] + " = " + arrayThree[c][r]);
            }
        }

        for (int cc = 0; cc < arrayThree.length; cc ++) {
            for (int rr = 0; rr < arrayThree[0].length; rr ++) {
                System.out.print(arrayThree[cc][rr] + "\n");

            }
            System.out.println();
        }
;



    }
}
