/**
 * Created by cad141 on 17. 5. 25.
 */
import java.util.Scanner;

public class sumOfDigits {
    public static void main (String[] args) {
        Scanner iI = new Scanner(System.in);
        System.out.println("Please enter your input: ");
        long n = iI.nextLong();
        System. out.println(sumDigits(n));
    }

        public static int sumDigits(long n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
    }

    }

