/**
 * Created by cad113 on 6/12/17.
 */
import java.util.Scanner;
public class dataTypeEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the mintues.");
        int input = scanner.nextInt();
        System.out.println(calculate(input));
    }

    public static int calculate(int n) {
        int day = 0;
        int year = 0;
        if (n > 60) {
            day = n / 60;
            if (day >= 365) {
                year = day / 365;
            }
            else if (day < 365) {
                return day;
            }
        }
        return year;
    }
}