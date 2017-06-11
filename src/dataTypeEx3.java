/**
 * Created by cad113 on 6/12/17.
 */

import java.util.Scanner;
public class dataTypeEx3 {
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Please enter the value.");
        long input = s.nextInt();

        if (0 < input && input < 1000){
            System.out.println(calculate(input));
        }
        else if (0 > input || input > 1000){
            System.out.println("The value does not match.");
        }
    }

    public static int calculate(long i){
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

}
