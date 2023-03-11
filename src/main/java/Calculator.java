import java.util.Scanner;
import java.lang.Math;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        while (true) {
            System.out.println("Please enter operation code : ");
            System.out.println("1 --> square root");
            System.out.println("2 --> Factorial ");
            System.out.println("3 --> Natural Logarithm");
            System.out.println("4 --> Power Function");
            System.out.println("5 --> exit");
            System.out.println("--------------------------------");
            int code = sc.nextInt();
            if (code == 5) {
                System.out.println("Thanks for visiting!");
                break;
            }
            System.out.print("Enter the number for which you would like to find ");
            if (code == 1) {
                System.out.print("Square Root : ");
                int operand = sc.nextInt();
                System.out.print("The square root of ");
                System.out.print(operand);
                System.out.print(" is ");
                System.out.println(Calculator.squareRoot(operand));
            }
            System.out.println("--------------------------------");
        }
        sc.close();
    }

    public static double squareRoot(int operand) {
        return Math.sqrt(operand);
    }

}
