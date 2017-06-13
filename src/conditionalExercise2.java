/**
 * Created by cad113 on 6/13/17.
 */
import java.util.Scanner;
public class conditionalExercise2 {
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        double plus;
        double minus;
        System.out.println("Input a:");
        int a = s.nextInt();
        System.out.println("Input b:");
        int b = s.nextInt();
        System.out.println("Input c:");
        int c = s.nextInt();
        plus = (((-b)+ Math.sqrt((Math.pow(b, 2) -( 4*(a*c))))) / (2*a));
        minus = (((-b)-Math.sqrt((Math.pow(b, 2) -( 4*(a*c))))) / (2*a));
        System.out.println("Expected Output\nThe roots are " + plus + " and " +minus);


    }
}
