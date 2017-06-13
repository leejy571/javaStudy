/**
 * Created by cad113 on 6/12/17.
 */

import java.util.Scanner;
public class dataTypeEx1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double inputFahrenheit = scanner.nextDouble();

        System.out.println(feToCel(inputFahrenheit));

    }

    public static double feToCel(double i) {
        return (((i-32) * 5)/9);
    }
}
