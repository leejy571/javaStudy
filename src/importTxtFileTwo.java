/**
 * Created by cad113 on 17. 6. 6.
 */
import java.io.*;
import java.util.Scanner;
public class importTxtFileTwo {
    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter the first file path.");
        String pathOne = i.nextLine();
        String newFileOne = pathOne;
        String line = null;
        try {
            FileReader fileReader = new FileReader(newFileOne);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file does not exist.");
        } catch (IOException ex) {
            System.out.println("The file path is not correct.");
        }
        System.out.println("Please enter the second file path.");
        String pathTwo = i.nextLine();
        String newFileTwo = pathTwo;
        //String line = null;
        try {
            FileReader fileReader = new FileReader(newFileTwo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file does not exist.");
        } catch (IOException ex) {
            System.out.println("The file path is not correct.");
        }


    }
}
