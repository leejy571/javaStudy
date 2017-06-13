/**
 * Created by cad113 on 6/13/17.
 */
import java.util.Scanner;
public class conditionalExercise3 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Test Data\nInput the 1st number: ");
        int firstInput = s.nextInt();
        System.out.println("Input the 2nd number: ");
        int secondInput = s.nextInt();
        System.out.println("Input the 3rd number: ");
        int thirdInput = s.nextInt();

        System.out.println("Expected Output :\nThe greatest: "+ calculate(firstInput, secondInput, thirdInput));
    }

    public static int calculate(int x, int y, int z) {
        if (x > y || x > z) {
            return x;
        } else if (y > x || y > z) {
            return y;
        } else if (z > y || z > x) {
            return z;
        }
        else return false;
    }
}

/*
3. Take three numbers from the user and print the greatest number. Go to the editor

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
 */