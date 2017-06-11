import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cad113 on 6/6/17.
 */
public class importTxtFileFive {
    public static void main(String[] args) {
        String path = "/home/cad211/Desktop/arrayOne.txt";
        try {
            FileReader file = new FileReader(path);
            BufferedReader input = new BufferedReader(file);
            Scanner inputReader = new Scanner(System.in);
            List<Integer> list = new ArrayList<Integer>();
            String temp = "";
            while ((temp = input.readLine()) != null)
                if (!temp.trim().equals("0"))
                    list.add(new Integer(temp));
            input.close();

            System.out.println("Please input your 2nd array's row value. ");
            int secondArrayRow = inputReader.nextInt();
            System.out.println("Please input your 2nd array's column value. ");
            int secondArrayColumn = inputReader.nextInt();
            int[][] arrayTwo = new int[secondArrayRow][secondArrayColumn];
            System.out.println("Your arrays are " + secondArrayRow + " by " + secondArrayColumn);

            for (Integer number : list) {
                for (int rTwo = 0; rTwo < arrayTwo.length; rTwo++) {
                    for (int cTwo = 0; cTwo < arrayTwo[0].length; cTwo++) {
                        //System.out.print(number + " ");
                        arrayTwo[rTwo][cTwo] = number;
                        number = 0;
                    }
                }
            }

            for (int rTwo = 0; rTwo < arrayTwo.length; rTwo++) {
                for (int cTwo = 0; cTwo < arrayTwo[0].length; cTwo++) {
                    System.out.println(arrayTwo[rTwo][cTwo]);
                }
                System.out.println();
            }

        } catch(IOException ie){
            System.out.println(ie);
        }
    }
}




