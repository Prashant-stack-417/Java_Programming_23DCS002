class a {
    void displaybase() {
        System.out.println("Base Class");
    }

}

class b extends a {
    void display() {
        System.out.println("Derived A Class");
    }
}

class c extends a {
    void display() {
        System.out.println("Derived B Class");
    }
}

public class multiple {
    public static void main(String[] args) {

        c c1 = new c();
        b b1 = new b();

        c1.display();
        c1.displaybase();
        b1.displaybase();

    }
}