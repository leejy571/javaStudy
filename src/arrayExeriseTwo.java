/**
 * Created by cad211 on 7/5/17.
 */
import java.util.Scanner;
import java.util.Arrays;
public class arrayExeriseTwo {
    public static void main (String[] args) {
        int [] arrayInput = new int[10];
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int ctr = 0; ctr < 10; ctr++) {
            System.out.println("Please enter the " + (ctr +1) +"th values.");
            if (s.hasNextInt()) {
                arrayInput[ctr] = s.nextInt();
                sum = sum + arrayInput[ctr];
            }

            else if (!s.hasNextInt()) {
                System.out.println("Please enter an integer value.");
                break;
            }
            else {
                System.out.println("Invalid input.");
                break;
            }
        }
        System.out.println(sum);
    }
}

/*
2. Write a Java program to sum values of an array. Go to the editor

Click me to see the solution
 */