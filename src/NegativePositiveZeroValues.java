import java.util.Scanner;


public class NegativePositiveZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int countPoz = 0;
        int count = 0;
        int countNeg = 0;
        System.out.println("The number1 ");
        a = input.nextInt();
        System.out.println("The number2 ");
        b = input.nextInt();
        System.out.println("The number3 ");
        c = input.nextInt();
        System.out.println("The number4 ");
        d = input.nextInt();
        System.out.println("The number5 ");
        e = input.nextInt();


        if (a > 0) {
            countPoz++;
        } else if (a < 0) {
            countNeg++;
        } else {
            count++;
        }

        if (b > 0) {
            countPoz++;
        } else if (b < 0) {
            countNeg++;
        } else {
            count++;
        }

        if (c > 0) {
            countPoz++;
        } else if (c < 0) {
            countNeg++;
        } else {
            count++;
        }
        if (d > 0) {
            countPoz++;
        } else if (d < 0) {
            countNeg++;
        } else {
            count++;
        }

        if (e > 0) {
            countPoz++;
        } else if (e < 0) {
            countNeg++;
        } else {
            count++;
        }

        System.out.println("The number of negative numbers input is " + countNeg);
        System.out.println("The number of positive numbers input is " + countPoz);
        System.out.println("The number of zero input is " + count);
    }
}

