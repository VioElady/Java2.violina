import java.util.Scanner;

public class DiameterCircumferenceandAreaofaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("The radius= ");
        radius = input.nextDouble();
        System.out.println("The diameter is " + Diameter(radius));
        System.out.println("The circumference is " + Circumference(radius));
        System.out.println("The area is " + Area(radius));


    }

    public static double Diameter(double r) {
        double x;
        x = 2 * r;
        return x;
    }

    public static double Circumference(double r) {
        double y;
        y = 2 * r * Math.PI;
        return y;
    }

    public static double Area(double r) {
        double z;
        z = Math.pow(r, 2) * Math.PI;
        return z;
    }
}

