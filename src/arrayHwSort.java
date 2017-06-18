import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cad211 on 6/14/17.
 */
public class arrayHwSort {
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
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));


        /*
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum value within the array is " + max);

        public class ArrayDemo {

   public static void main(String[] args) {

   // initializing unsorted int array
   int iArr[] = {2, 1, 9, 6, 4};

   // let us print all the elements available in list
   for (int number : iArr) {
   System.out.println("Number = " + number);
   }

   // sorting array
   Arrays.sort(iArr);

   // let us print all the elements available in list
   System.out.println("The sorted int array is:");
   for (int number : iArr) {
   System.out.println("Number = " + number);
   }
   }
}

        */
    }
}
