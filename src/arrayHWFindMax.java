/**
 * Created by cad211 on 6/14/17.
 */
import java.util.Arrays;
import java.util.Scanner;
public class arrayHWFindMax {
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
        int max = array[0];
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum value within the array is " + max);
    }
}

/*
int[] convertedValues = new int[10];
int max=convertedValues[0];

for (int i = 0; i < convertedValues.length; i++) {
    if (convertedValues[i] > max) {
        max = convertedValues[i];
    }
}

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
 */