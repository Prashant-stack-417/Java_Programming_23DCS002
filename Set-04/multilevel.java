class A {

    String s1 = "This Is Class A";

    void printa() {
        System.out.println(s1);
    }
}

class B extends A {

    void printb() {
        System.out.println("THis is B");
    }

}

class C extends B {

    void printc() {
        System.out.println("THis is C");
    }
}

public class multilevel {
    public static void main(String[] args) {

        C c1 = new C();
        c1.printa();
        c1.printb();
        c1.printc();
    }
}