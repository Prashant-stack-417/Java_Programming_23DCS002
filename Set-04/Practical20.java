class Shape {
    void printbase() {
        System.out.println("This is This is shape");
    }
}

class Reactangle extends Shape {
    void printrect() {
        System.out.println("This is Rectangular shape");
    }
}

class Circle extends Shape {
    void printcir() {
        System.out.println("This is Circle shape");
    }
}

class Square extends Reactangle {
    void printsqu() {
        System.out.println("Square Is a Rectangle");
    }
}

public class Practical20 {
    public static void main(String[] args) {

        Square s1 = new Square();
        s1.printbase();
        s1.printrect();

    }
}