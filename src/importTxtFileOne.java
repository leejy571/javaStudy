/**
 * Created by cad211 on 6/6/17.
 */
import java.io.*;
import java.util.Scanner;
public class importTxtFileOne {
    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter the path.");
        String path = i.nextLine();
        String file = path;
        String line = null;

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((null = bufferedReader.readLine()) != line) {
                System.out.println(path);
            }
            bufferedRead.close();
        }
    }
}
