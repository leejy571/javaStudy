/**
 * Created by cad211 on 6/11/17.
 */

import java.util.Scanner;
public class exercise34 {
    public static void main (String[] args) {
       Scanner s = new Scanner(System.in);
       int i = s.nextInt();
       System.out.println(hexagoneArea(i));
    }

    public static double hexagoneArea(double s) {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
        )Math.ta
    }
}
