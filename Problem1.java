import java.util.Scanner;

public class Problem1 {
    double calculate(double a, double b, String operation) {
        switch (operation) {
            case "add": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide": return b != 0 ? a / b : Double.NaN;
            default: throw new IllegalArgumentException("Invalid operation");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem1 calculator = new Problem1();
        String cont;
        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Enter operation (add, subtract, multiply, divide): ");
            String op = sc.next();
            double result = calculator.calculate(a, b, op);
            System.out.println("Result: " + result);
            System.out.print("Do you want to continue? (yes/no): ");
            cont = sc.next();
        } while(cont.equalsIgnoreCase("yes"));
        sc.close();
    }
}
