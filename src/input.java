import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by cad211 on 6/7/17.
 */
public class input {
    public static void main (String[] args) throws IOException {
        String filePath = "/home/cad211/Desktop/javaStudy/src/input.txt";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            String line = bufferedReader.readLine();
            if(line==null) break;
          System.out.println(line);
            StringTokenizer st = new StringTokenizer(line);
            System.out.println(st.countTokens());

            while (st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        }
        bufferedReader.close();
    }

}
