/**
 * Created by cad113 on 17. 6. 5.
 */
import java.util.Scanner;
public class nullValidation {
    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);
        String input = i.nextLine();
        if (input.equals("") || input.equals(" ")){
            System.out.println("False.");
        }

    }
}
