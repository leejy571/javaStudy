/**
 * Created by cad113 on 17. 6. 4.
 */

import java.util.Scanner;
public class validaitonCheckTwo {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        int input;
        System.out.println("Please enter a row value.");

        do {
            while (!i.hasNextInt()) {
                String stringInput = i.nextLine();
                System.out.println("Your value must be a positive integer.");
            }
            input = i.nextInt();
        }
        while (input < 0);
        System.out.println("Your first row input is " + input );
    }

}