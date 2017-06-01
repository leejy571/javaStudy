/**
 * Created by cad141 on 17. 5. 27.
 */
public class hwArrayTestTwo {
    public static void main(String[] args) {


        int[][] arrayOne =  {{1, 2, 3, 4, 5}
                            };

        for(int c = 0; c < arrayOne.length; c ++) {
            for (int r = 0; r < arrayOne[0].length; r++) {
                System.out.println(arrayOne[c][r]);
            }
        }
    }
}
