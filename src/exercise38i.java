/**
 * Created by cad113 on 6/11/17.
 */
import java.util.Scanner;
public class exercise38i {
    public static void main (String[] args) {
        int amount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Frist value.");
        int first = scanner.nextInt();
        System.out.println("Second value.");
        int second = scanner.nextInt();

        for(int i = first; i <= second; i++) {
            for (int j = first; j <= second; j ++) {
                for (int k = first; k <= second; k ++) {
                    if(i != j && i != k && j != k){
                        amount ++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println(amount);

    }

}
