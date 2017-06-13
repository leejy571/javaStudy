/**
 * Created by cad113 on 6/13/17.
 */
import java.util.Scanner;
public class conditionalExercise {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Test Data\nInput number: ");
        int input = s.nextInt();
        System.out.println("Expected Output : ");

        if(input > 0) {
            System.out.println("Number is positive.");
        }
        else if(input < 0) {
            System.out.println("Number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }
    }
}
