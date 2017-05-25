/**
 * Created by cad141 on 17. 5. 25.
 */
public class calculationRadius {
    public static void main (String[] args) {
        double radius = 7.5;
        double pi= 3.14;
        double area = pi * Math.pow(radius, 2);
        double cir = 2 * pi * radius;

        System.out.println("Perimeter is = " + cir);
        System.out.println("Area is = " + area);
    }
}
