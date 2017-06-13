/**
 * Created by cad113 on 6/11/17.
 */
import java.util.Scanner;
public class exercise33i {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        long input = s.nextLong();
        System.out.println(calc(input));
    }

    public static int calc(long n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}