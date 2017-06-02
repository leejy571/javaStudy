/**
 * Created by cad113 on 17. 6. 2.
 */
import java.util.Scanner;
public class validationCheckOne {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a value.");

        if (a.hasNextInt()) {
            int value = a.nextInt();
            System.out.println("You have entered " + value);
        }
        else if (!a.hasNextInt()) {
            System.out.println("Your value is not correct.");
        }



    }
}
