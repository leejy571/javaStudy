import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cad211 on 6/14/17.
 */
public class arrayHWFindMin {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pleas enter your array length.");
        int arrayLength = s.nextInt();
        int [] array = new int [arrayLength];

        for (int i = 0; i < arrayLength; i ++) {
            int counter = i +1;
            System.out.println("Pleas enter your "+ counter +" array inputs.");
            array [i] = s.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The maximum value within the array is " + min);
    }
}

