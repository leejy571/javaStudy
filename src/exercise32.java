/**
 * Created by cad211 on 6/11/17.
 */
import java.util.Scanner;
public class exercise32 {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Please enter the first value.");
        int firstInput = s.nextInt();
        System.out.println("Please enter the second value.");
        int secondInput = s.nextInt();

        if (firstInput != secondInput) {
            System.out.println(firstInput + " != " + secondInput);
        }
        else if (firstInput == secondInput) {
            System.out.println(firstInput + " = " + secondInput);
        }

        if (firstInput < secondInput){
            System.out.println(firstInput + " < " + secondInput);
        }
        else if (firstInput > secondInput){
            System.out.println(firstInput + " > " + secondInput);
        }
        else {
            System.out.println("The values are equal.");
        }
        if (firstInput <= secondInput){
            System.out.println(firstInput + " <= " + secondInput);
        }
        else if (firstInput >= secondInput){
            System.out.println(firstInput + " >= " + secondInput);
        }
    }
}
