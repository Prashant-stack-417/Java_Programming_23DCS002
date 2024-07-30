
import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        String n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String = ");
        n = s.nextLine();

        String n1 = n.substring(0, 3);

        front_times(n1, 2);
        front_times(n1, 3);
        s.close();
    }

    static void front_times(String n, int a) {
        int i;
        for (i = 0; i < a; i++) {
            System.out.print(n);
        }

    }
}
