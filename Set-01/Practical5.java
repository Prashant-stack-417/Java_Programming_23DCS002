import java.util.*;

public class Practical5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice, c;

        System.out.println("1.Motor");
        System.out.println("2.Fan");
        System.out.println("3.Tube");
        System.out.println("4.Wires");
        System.out.println("5.Other");
        System.out.println("Enter your choice:");
        choice = s.nextInt();

        double[] prices = { 1000.0, 500.0, 200.0, 150.0, 800.0 };

        double tax = 0.0;
        System.out.println("Enter the Items:");
        c = s.nextInt();

        switch (choice) {
            case 1:
                tax = (prices[0] + (prices[0] * 0.08)) * c;
                break;
            case 2:
                tax = (prices[1] + (prices[1] * 0.12)) * c;
                break;
            case 3:
                tax = (prices[2] + (prices[2] * 0.05)) * c;
                break;
            case 4:
                tax = (prices[3] + (prices[3] * 0.075)) * c;
                break;

            case 5:
                tax = (prices[4] + (prices[4] * 0.03)) * c;
                break;
        }

        System.out.println("Product Code: " + choice + ",Total: " + tax);
        s.close();
    }
}
