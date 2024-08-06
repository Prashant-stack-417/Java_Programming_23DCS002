class Degree {
    void getDegree() {
        System.out.println("I got a Degree");
    }
}

class Undergraduate {
    void print() {
        System.out.println("I am Undergraduate ");
    }
}

class Postgraduate {
    void print() {
        System.out.println("I am a Postgraduate");
    }

}

public class Practical21 {
    public static void main(String[] args) {

        Degree d1 = new Degree();
        Undergraduate u1 = new Undergraduate();
        Postgraduate p1 = new Postgraduate();

        d1.getDegree();
        u1.print();
        p1.print();

    }
}