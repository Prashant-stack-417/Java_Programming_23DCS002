import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        if (age < 18) {
            try {
                throw new InvalidAgeException("Not eligible for voting in 2019");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("You are eligible for voting in 2019");
        }
    }
}
