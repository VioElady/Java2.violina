
import java.util.Scanner;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        Scanner input = new Scanner(System.in);
        System.out.println("The nombre1= ");
        a = input.nextInt();
        System.out.println("The nombre2= ");
        b = input.nextInt();
        System.out.println("The nombre3= ");
        c = input.nextInt();
        System.out.println("The nombre4= ");
        d = input.nextInt();
        System.out.println("The nombre5= ");
        e = input.nextInt();
        System.out.println("Max number is " + Maximum(a, b, c, d, e));
        System.out.println("Min number is " + Minim(a, b, c, d, e));

    }

    public static int Maximum(int x, int y, int z, int v, int n) {
        int max = x;

        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        if (v > max) {
            max = v;
        }
        if (n > max) {
            max = n;
        }
        return max;
    }

    public static int Minim(int x, int y, int z, int v, int n) {
        int min = x;

        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        if (v < min) {
            min = v;
        }
        if (n < min) {
            min = n;
        }
        return min;
    }
}
