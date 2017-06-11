/**
 * Created by cad113 on 6/8/17.
 */
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the value.");
        int digit = s.nextInt();
        decimalToBinary obj = new decimalToBinary();
        obj.convertBinary(digit);
    }

    public void convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(binary[i]);
        }
    }
}
