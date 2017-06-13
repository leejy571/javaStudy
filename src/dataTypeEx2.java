/**
 * Created by cad113 on 6/12/17.
 */

import java.util.Scanner;
public class dataTypeEx2 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the value.");
        double input = s.nextDouble();
        System.out.println(inputValidation(input));


    }

    public static double inputValidation(double n) {
        return(n * (0.0254));
    }
}
