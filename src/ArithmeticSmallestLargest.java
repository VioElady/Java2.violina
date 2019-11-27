import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int nb1;
        int nb2;
        int nb3;
        System.out.println("Enter first number integer:");
        nb1=input.nextInt();
        System.out.println("Enter second number integer:");
        nb2=input.nextInt();
        System.out.println("Enter third number integer:");
        nb3=input.nextInt();
        System.out.println("Sum is "+ Addition(nb1,nb2,nb3));
        System.out.println("Product is "+ Product(nb1,nb2,nb3));
        System.out.println("Average is "+ Average(nb1,nb2,nb3));

    }

    public static int Addition(int x,int y,int z){
        int sum;
        sum = x + y + z;
        return sum;
    }

    public static int Product(int x,int y,int z){
        int prod;
        prod = x + y + z;
        return prod;
    }

    public static int Average(int x,int y,int z){
        int aver;
        aver=( x + y + z )/3;
        return aver;
    }
}
