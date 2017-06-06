/**
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
                System.out.println(line);
            }
            bufferedReader.close();
        }

            catch (FileNotFoundException ex) {
                System.out.println("H");
            }

            catch (IOException ex) {
                System.out.println("F");
            }
        }
    }

