/**
 * Created by cad113 on 6/7/17.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
    public class importTxtFileSix {

        static Scanner s;
        static File f;
        static ArrayList<String> words (Scanner s, File f){
            f = new File("/home/cad113/Desktop/arrayOne.txt");
            try {
                s = new Scanner(f);
            } catch (FileNotFoundException e) {

                e.printStackTrace();
            }
            ArrayList <String> theWord = new ArrayList <String>();
            while(s.hasNext()){
                String str=s.next();
                theWord.add(str);
            }
            return theWord;
        }
        public static void main (String [] args){
            ArrayList <String> fileWords;
            fileWords=words(s,f);
            System.out.println(fileWords);
        }
    }
