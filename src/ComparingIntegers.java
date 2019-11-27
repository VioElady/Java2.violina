import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nb1;
        int nb2;
        System.out.println("Enter first number integer:");
        nb1 = input.nextInt();
        System.out.println("Enter second number integer:");
        nb2 = input.nextInt();

        if (nb1 == nb2) {
            System.out.println(nb1 + "=" + nb2);
        }

        if (nb1 < nb2) {
            System.out.println(nb1 + "<" + nb2);
        }
        if (nb1 > nb2) {
            System.out.println(nb1 + ">" + nb2);
        }


    }

}
