import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double num1, num2;
        char operator;
        double result = 0.0;

        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                try {
                    result = calculator.divide(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("The result is: " + result);
    }
}