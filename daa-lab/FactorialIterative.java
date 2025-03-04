import java.util.Scanner;

public class FactorialIterative {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
        
        scanner.close();
    }
}