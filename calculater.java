
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Choose operation (+, -, *, /):");
        char op = sc.next().charAt(0);
        double result = 0;

        switch(op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default: System.out.println("Invalid operator"); return;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}
