class animal {
    void walk() {
        System.out.println("Walking");
    }

}

class dog extends animal {

    void bark() {
        System.out.println("Bark");
    }

}

public class singleinheritance {
    public static void main(String[] args) {

        dog d1 = new dog();
        d1.walk();
        d1.bark();
    }
}