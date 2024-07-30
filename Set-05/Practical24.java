import java.util.*;

class c {
    void divide(int a, int b) {
        int c;

        try {
            c = a / b;
            System.out.println("Division= " + c);
        } catch (Exception e) {
            System.out.println("Dividing by Zero is invalid");
        }
    }
}

public class Practical24 {

    public static void main(String[] args) {
        c e = new c();
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        a = s.nextInt();
        b = s.nextInt();
        e.divide(a, b);
        s.close();
    }
}