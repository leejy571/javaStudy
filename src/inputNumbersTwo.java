/**
 * Created by cad141 on 17. 5. 25.
 */

import java.util.Scanner;
public class inputNumbersTwo {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please print the first value. ");
        int firstValue = scan.nextInt();
        System.out.println("Please print the second value. " );
        int secondValue = scan.nextInt();
        int finalValue = firstValue + secondValue;

        System.out.println(firstValue + " X " + secondValue+ " = " +finalValue);



    }
}