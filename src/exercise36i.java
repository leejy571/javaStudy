/**
 * Created by cad113 on 6/11/17.
 */
import java.util.Scanner;
public class exercise36i {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your value.");
        double lat1 = scanner.nextDouble();
        System.out.println("Please enter your value.");
        double long1 = scanner.nextDouble();
        System.out.println("Please enter your value.");
        double lat2 = scanner.nextDouble();
        System.out.println("Please enter your value.");
        double long2 = scanner.nextDouble();
        System.out.println("The values are " +calculateValue(lat1, long1, lat2, long2));
    }

    public static double calculateValue(double latOne, double longOne, double latTwo, double longTwo){
        double radius = 6371.01;
        latOne = Math.toRadians(latOne);
        longOne = Math.toRadians((longOne));
        latTwo = Math.toRadians((latTwo));
        longTwo = Math.toRadians(longTwo);
        return radius * Math.acos(Math.sin(latOne)* Math.sin(latTwo) + Math.cos(latOne) + Math.cos(latTwo) * Math.cos(longOne - longTwo));
    }
}
