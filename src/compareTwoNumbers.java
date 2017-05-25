/**
 * Created by cad141 on 17. 5. 25.
 */
import java.util.Scanner;

public class compareTwoNumbers {
    public static void main (String[] args) {
        Scanner i = new Scanner (System.in);
        int inputOne = i.nextInt();
        int inputTwo = i.nextInt();

        if (inputOne == inputTwo) {
            System.out.println(inputOne + " = " + inputTwo);
        }
        if (inputOne != inputTwo) {
            System.out.println(inputOne + " != " + inputTwo);
        }

        if (inputOne < inputTwo) {
            System.out.println(inputOne + " < " + inputTwo);
        }
        else if (inputOne > inputTwo) {
            System.out.println(inputOne + " > " + inputTwo);
        }

        if (inputOne <= inputTwo) {
            System.out.println(inputOne + " <= " + inputTwo);
        }
        else if (inputOne >= inputTwo) {
            System.out.println(inputOne + " >= " + inputTwo);
        }
    }
}
