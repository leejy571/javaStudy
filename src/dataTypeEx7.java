/**
 * Created by cad113 on 6/13/17.
 */
import java.util.Scanner;
public class dataTypeEx7 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Please enter the distance.");
        int meters = s.nextInt();
        System.out.println("Please enter the hours.");
        int hours = s.nextInt();
        System.out.println("Please enter the minutes.");
        int minutes = s.nextInt();
        System.out.println("Please enter the seconds.");
        int seconds = s.nextInt();

        double miles = meters / 1609;
        double kilometer = meters / 1000;
        double allinSeconds = ((hours * 120) + (minutes * 60) + seconds);
        double allinHours = (hours + (minutes / 60) + (seconds/120));

        double metersecond = meters/allinSeconds;
        double kilometerHour = kilometer/allinHours;
        double milesHour = miles / allinHours;

        System.out.println("Your speed in meter/second is " + metersecond);
        System.out.println("Your speed in meter/second is " + kilometerHour);
        System.out.println("Your speed in meter/second is " + milesHour);
    }
}
