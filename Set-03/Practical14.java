import java.util.*;

class Date {
    int d, m, y;
    Scanner s = new Scanner(System.in);

    Date() {

    }

    public Date(int D, int M, int Y) {
        d = D;
        m = M;
        y = Y;
    }

    void setd() {
        System.out.println("Enter the day:");
        d = s.nextInt();
    }

    void setm() {
        System.out.println("Enter the month:");
        m = s.nextInt();
    }

    void sety() {
        System.out.println("Enter the year:");
        y = s.nextInt();
    }

    void display() {
        System.out.println("Date:" + d + "/" + m + "/" + y);
    }
}

public class Practical14 {
    public static void main(String[] args) {
        Date d = new Date();
        d.setd();
        d.setm();
        d.sety();
        d.display();

    }

}
