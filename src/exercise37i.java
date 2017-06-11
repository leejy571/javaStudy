/**
 * Created by cad113 on 6/11/17.
 */
import java.util.Scanner;
public class exercise37i {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    String input = scanner.nextLine();

    StringBuffer stringBuffer = new StringBuffer(input);
    System.out.println(stringBuffer.reverse());
    }
}