import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Practical22 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the divisors number:");
        n = scanner.nextInt();

        scanner.close();
        System.out.println("\nSum of divisors of " + n + " is " + calculator.divisor_sum(n));
    }
}