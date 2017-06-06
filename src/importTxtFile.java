/**
<<<<<<< HEAD
 * Created by cad211 on 6/6/17.
 */

import java.io.*;
public class importTxtFile {
    public static void main (String[] args) {
        String filePath = "/home/cad211/Desktop/github";
        String line = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while
                ((line = bufferedReader.readLine()) != null) {
=======
 * Created by cad113 on 17. 6. 5.
 */

import java.io.*;

public class importTxtFile {
    public static void main(String[] args) {
        String fileName = "/home/cad113/Desktop/arrayOne.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
>>>>>>> 45109868edf81be2f6a617af21ee0bd59f1c2e4e
                System.out.println(line);
            }
            bufferedReader.close();
        }
<<<<<<< HEAD

            catch (FileNotFoundException ex) {
                System.out.println("H");
            }

            catch (IOException ex) {
                System.out.println("F");
            }
        }
    }

=======
        catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "' ");
        }

    }
}
>>>>>>> 45109868edf81be2f6a617af21ee0bd59f1c2e4e
