/**
 * Created by cad211 on 6/11/17.
 */
import java.util.Scanner;
public class exercise33 {
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Please enter the value.");
        long integer = s.nextLong();
        System.out.println(calculateValue(integer));

    }

    public static int calculateValue(long integer){
        int sum = 0;
        while (integer != 0) {
            sum += integer % 10;
            integer /= 10;
        }
        return sum;
    }
}