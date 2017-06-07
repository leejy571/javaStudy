/**
<<<<<<< HEAD
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
=======
 * Created by cad113 on 17. 6. 5.
 */
import java.io.*;
import java.nio.Buffer;

public class importTxtFileOne {
   public static void main (String[] args) {
       String fileName = "/home/cad113/Desktop/arrayOne";
       String line = null;
       try
       {
           FileReader fileReader = new FileReader(fileName);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           while ((line = bufferedReader.readLine()) != null) {
               System.out.println(line);
           }
           bufferedReader.close();
       }
       catch (FileNotFoundException ex) {
           System.out.println("The file named " + fileName + ".");
       }
       catch (IOException ex) {
           System.out.println("File hmmmm");
       }

   }
>>>>>>> 45109868edf81be2f6a617af21ee0bd59f1c2e4e
}
