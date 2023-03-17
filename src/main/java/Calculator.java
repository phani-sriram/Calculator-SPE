import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
// Test Webhooks
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
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
            int code;
            try {
                code = sc.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            if (code == 5) {
                System.out.println("Thanks for visiting!");
                break;
            }

            if (code == 1) {
                System.out.print("Enter the number for which you would like to find ");
                System.out.print("Square Root : ");
                double operand = sc.nextDouble();
                if (operand < 0) {
                    System.out.println("Cannot find square root of negative number!");
                    continue;
                }
                System.out.print("The square root of ");
                System.out.print(operand);
                System.out.print(" is ");
                System.out.println(Calculator.squareRoot(operand));
                System.out.println("--------------------------------");
            } else if (code == 2) {
                System.out.print("Enter the number for which you would like to find ");
                System.out.print("Factorial : ");
                double operand = sc.nextDouble();
                if (operand < 0) {
                    System.out.println("Cannot find factorial of negative number!");
                    continue;
                }
                System.out.print("The factorial of ");
                System.out.print(operand);
                System.out.print(" is ");
                System.out.println(Calculator.factorial(operand));
                System.out.println("--------------------------------");
            } else if (code == 3) {
                System.out.print("Enter the number for which you would like to find ");
                System.out.print("Natural Logarithm : ");
                double operand = sc.nextDouble();
                if (operand < 0) {
                    System.out.println("Cannot find logarithm of negative number!");
                    continue;
                }
                System.out.print("The logarithm of ");
                System.out.print(operand);
                System.out.print(" is ");
                System.out.println(Calculator.logarithm(operand));
                System.out.println("--------------------------------");
            } else if (code == 4) {
                System.out.print("Enter the number for which you would like to find ");
                System.out.print("Power : ");
                System.out.print("\nPlease enter the base : ");
                double base = sc.nextDouble();
                System.out.print("Please enter the exponent :");
                double exp = sc.nextDouble();
                System.out.print("The value of ");
                System.out.print(base);
                System.out.print(" raised to " + exp + " is ");
                System.out.println(Calculator.power(base, exp));
                System.out.println("--------------------------------");
            }  else {
                System.out.println("Invalid operation code. Please try again");
                System.out.println("--------------------------------");
            }

        }
        sc.close();
    }

    public static double squareRoot(double operand) {
        logger.info("Square root - " + operand);
        double val = Math.sqrt(operand);
        logger.info("Square root - " + operand + " - ANSWER " + val);
        return val;
    }

    public static double factorial(double operand) {
        logger.info("Factorial - " + operand);
        double val = 1;
        for (int i = 1; i <= operand; i++) {
            val = val*i;
        }
        logger.info("Factorial - " + operand + " = " + val);
        return val;
    }

    public static double logarithm(double operand) {
        logger.info("Logarithm - " + operand);
        double log_val = Math.log(operand);
        logger.info("Logarithm - " + operand + " = " + log_val);
        return log_val;
    }

    public static double power(double base, double power) {
        logger.info("Power - " + base + " raised to " + power);
        double val = Math.pow(base, power);
        logger.info("Power - " + base + " raised to " + power + " Answer - " + val);
        return  val;
    }




}
