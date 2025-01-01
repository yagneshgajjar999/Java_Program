import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        double num1, num2, result = 0; // Initialize result
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        num1 = sc.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        System.out.print("Enter Second Number: ");
        num2 = sc.nextDouble();
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: division by zero");
                    return; // Exit to avoid printing uninitialized result
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return; // Exit to avoid printing uninitialized result
        }
        
        System.out.println("Result: " + result);
    }
}
