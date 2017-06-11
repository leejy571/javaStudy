import java.util.Scanner;

/**
 * Created by cad113 on 6/9/17.
 */
public class decimalToBinaryTwo {
    public static void main (String[] args){

        long decimal1, decimal2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        decimal1 = in.nextLong();
        System.out.print("Input second binary number: ");
        decimal2 = in.nextLong();

        while (decimal1 != 0 || decimal2 != 0)
        {
            sum[i++] = (int)((decimal1 % 2 + decimal2 % 2 + remainder) % 10);
            remainder = (int)((decimal1 % 2 + decimal2 % 2 + remainder) / 10);
            decimal1 = decimal1 / 2;
            decimal2 = decimal2 / 2;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}

