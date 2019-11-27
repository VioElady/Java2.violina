import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("The nombre1= ");
        number1 = input.nextInt();
        System.out.println("The nombre2= ");
        number2 = input.nextInt();
        if (number1 % number2 == 0) {
            System.out.println("The number 1 is multiple for number2");
        } else {
            System.out.println("The number 1 isn't multiple for number2");
        }

    }
}

