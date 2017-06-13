/**
 * Created by cad113 on 6/13/17.
 */

import java.util.Scanner;
public class dataTypeEx9 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first integer.");
        int firstInteger = s.nextInt();
        System.out.println("Please enter your second integer.");
        int secondInteger = s.nextInt();

        int sum = firstInteger + secondInteger;
        System.out.println(sum);
        System.out.println(distance(firstInteger, secondInteger));
        System.out.println(multiply(firstInteger, secondInteger));
        System.out.println(average(firstInteger, secondInteger));
        System.out.println(difference(firstInteger, secondInteger));
        System.out.println(max(firstInteger, secondInteger));
        System.out.println(min(firstInteger, secondInteger));
    }
    public static int distance(int x, int y){
        int difference = 0;
        if(x > y) {
            difference = x - y;
        }
        else if(x < y){
            difference = y -x;
        }
        else if(x == y) {
            return 0;
        }
        return difference;
    }
    public static double multiply(int x, int y){
        double multiple = x * y;
        return multiple;
    }
    public static double average(int x, int y){
        double av = (x * y)/2;
        return av;
    }
    public static double difference(int x, int y) {
        double diff = x - y;
        return diff;
    }
    public static double max (int x, int y) {
        if (x > y) {
        }
        return x;
    }
    public static double min (int x, int y) {
        if (x < y) {
        }
        return y;
    }

}

/*
9. Write a Java program that accepts two integers from the user and then prints the sum,
the difference, the product, the average, the distance (the difference between integer),
the maximum (the larger of the two integers), the minimum (smaller of the two integers).
Go to the editor

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5

Click me to see the solution

 */