/**
 * Created by cad113 on 6/7/17.
 */
import java.util.StringTokenizer;
import java.util.Scanner;
public class importTxtFileSeven {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence.");
        Scanner s = new Scanner(System.in);
        String sentenceInput = s.nextLine();
        String line = null;

        StringTokenizer stringTokenizer = new StringTokenizer(sentenceInput);
        System.out.println("The word counts are " + stringTokenizer.countTokens());
    }
}
