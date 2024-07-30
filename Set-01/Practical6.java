import java.util.*;

public class Practical6 {
    public static void main(String[] args) {
        int i, n;
        long sum = 0, a = 0, b = 1, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Total No Of Fibbonaci Value:");

        n = s.nextInt();
        s.close();

        System.out.println(a + "\n" + b);
        for (i = 1; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;

            System.out.println(temp);
            sum += temp;
        }

        System.out.println("Sum = " + sum);
    }
}
