import java.util.*;

class Emp {
    String fn, ln;
    double sl;
    Scanner s = new Scanner(System.in);

    Emp() {

    }

    public Emp(String f, String l, double s) {
        fn = f;
        ln = l;
        sl = s;
    }

    void setfn() {
        System.out.println("Enter the ferst name of the employee:");
        fn = s.nextLine();

    }

    void setln() {
        System.out.println("Enter the last name of the employee:");
        ln = s.nextLine();
    }

    void setsl() {
        System.out.println("Enter the salary of the employee");
        sl = s.nextDouble();
        if (sl < 0) {
            sl = 0.0;
        }
    }

    String getfn() {
        return fn;
    }

    String getln() {
        return ln;
    }

    double getsl() {
        return sl;
    }
}

public class Practical13 {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setfn();
        e1.setln();
        e1.setsl();
        System.out.println("------------------------");
        System.out.println("The first name of the employee is: " + e1.getfn());
        System.out.println("The last name of the employee is: " + e1.getln());
        System.out.println("The salary of the employee is: " + e1.getsl());
    }
}