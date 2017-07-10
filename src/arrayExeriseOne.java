/**
 * Created by cad211 on 7/5/17.
 */

import java.util.Scanner;
import java.util.Arrays;
public class arrayExeriseOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a value.");
        String [] arrayString = new String [10];
        for (int ctr = 0; ctr < arrayString.length; ctr ++) {
            arrayString[ctr] = s.nextLine();
        }
        System.out.println(Arrays.toString(arrayString));

    }
}
