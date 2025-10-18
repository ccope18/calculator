import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
           
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
