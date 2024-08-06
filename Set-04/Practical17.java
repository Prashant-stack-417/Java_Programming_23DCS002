class parent {
    void display1() {
        System.out.println("This is Parent Class");
    }

}

class child extends parent {

    void display2() {
        System.out.println("This is Child Class");
    }

}

public class Practical17 {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();

        c.display1();
        c.display2();
    }
}