class Area {
    double l, b;

    Area() {

    }

    Area(double x, double y) {
        l = x;
        b = y;
    }

    double area() {
        return l * b;
    }
}

public class Practical15 {
    public static void main(String[] args) {
        Area a = new Area(10, 20);
        System.out.println(a.area());
        Area b = new Area();
        System.out.println(b.area());
    }
}