/**
 * Created by cad211 on 17. 5. 26.
 */

class Car {
    String name;
    int number;

    public Car(String n, int f) {
        name = n;
        number = f;
    }
}


public class carExamTwo {
    public static void main (String[] args) {
        Car c1 = new Car ("Fire Truck", 4);
        Car c2 = new Car ("Police Car", 8);

        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c1.number);
        System.out.println(c2.number);


    }


}
