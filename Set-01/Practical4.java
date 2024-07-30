import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double[] dailyExpenses = new double[5];

        for (int i = 0; i < dailyExpenses.length; i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            dailyExpenses[i] = x.nextDouble();
        }

        double totalExpenses = calculateTotalExpenses(dailyExpenses);

        System.out.println("Total expenses for the 5 Days: Rs." + totalExpenses);
        x.close();
    }

    public static double calculateTotalExpenses(double[] dailyExpenses) {
        double totalExpenses = 0.0;

        for (double expense : dailyExpenses) {
            totalExpenses += expense;
        }

        return totalExpenses;
    }

}
