import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nb1;
        int nb2;

        System.out.println("Enter first number integer:");
        nb1 = input.nextInt();
        System.out.println("Enter second number integer:");
        nb2 = input.nextInt();
        System.out.println("Sum is " + Addition(nb1, nb2));

    }

    public static int Addition(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

}
