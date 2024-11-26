import java.util.Scanner;
import java.util.Vector;

public class FactorialCalculator {
    public static Vector<Long> factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        Vector<Long> factorials = new Vector<>(n);
        factorials.add(1L); // Factorial of 0 is 1

        for (int i = 1; i < n; ++i) {
            long nextFactorial = factorials.get(i - 1) * i;
            if (nextFactorial / i != factorials.get(i - 1)) {
                throw new ArithmeticException("Factorial overflow detected");
            }
            factorials.add(nextFactorial);
        }
        return factorials;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
