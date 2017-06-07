/**
 * Created by cad113 on 6/7/17.
 */
import javax.annotation.processing.FilerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class importTxtFileSeven {
    static File f;
    static Scanner s;
    static ArrayList<String> file (File f, Scanner s) {
        f = new File ("/home/cad113/Desktop/arrayOne.txt");

        try {
            s = new Scanner(f);
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        ArrayList<String> word = new ArrayList<String>();
        while(s.hasNextInt()){
            String str = s.next();
            theword.add(str);
        }
        return theWord;
    }
    public static void main (String[] args) {
        ArrayList<String> fileWords;
        fileWords=words(s,f);
        System.out.println(fileWords);
    }

}