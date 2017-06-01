/**
 * Created by cad141 on 17. 5. 27.
 */
public class hwArrayTestThree {
    public static void main (String[] args) {
        int arrayOne [] [] = {   {1,2,3},
                                 {4,5,6},
                                    {7,8,9}
                            };
        int arrayTwo [][] = {   {9, 8, 7},
                                {6,5,4},
                                {3,2,1}
                            };

        for(int c = 0; c < arrayOne.length && c < arrayTwo.length; c ++) {
            for(int r = 0; r < arrayOne[0].length && r < arrayTwo[0].length; r++) {

                int arrayThree [] [] = new int [3][3];
                arrayThree[c][r] = arrayOne [c][r] + arrayTwo [c][r];
                System.out.println(arrayThree[c][r]);
            }
        }

    }
}
