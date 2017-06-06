/**
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
}
