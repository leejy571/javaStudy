/**
 * Created by cad113 on 6/11/17.
 */
import java.util.Scanner;
public class exercise35i {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the value n.");
        double n = scanner.nextDouble();
        System.out.println("Please enter the value s.");
        double s = scanner.nextDouble();
        System.out.println("Your results are " + calculationI(n,s));


    }
    public static double calculationI(double n, double s) {
        return ((n *(s * s))/(4*Math.tan(Math.PI/n)));
    }
}
