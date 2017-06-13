/**
 * Created by cad113 on 6/12/17.
 */
import java.util.Scanner;
public class dataTypeEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the mintues.");
        int input = scanner.nextInt();

        int minToDay = input / 1440;
        int dayToYear = minToDay / 365;
        int leftDays = minToDay % 365;

        if (input < 1440) {
            System.out.println(input + " minutes is approximately " + minToDay + " days.");
        }
        else if (minToDay > 365) {
            System.out.println(input + " minutes is approximately " + dayToYear + " years " + leftDays + " days.");

        }
    }

}
/*
4. Write a Java program to convert minutes into a number of years and days. Go to the editor

        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days
*/