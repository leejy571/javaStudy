/**
 * Created by cad113 on 6/11/17.
 */
import java.util.Scanner;
public class exercise34i {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        double input = s.nextDouble();
        System.out.println(intCalculation(input));
    }

    public static double intCalculation(double n) {
        return ((6 * (n * n))/(4*Math.tan(Math.PI)/6));

    }
}
