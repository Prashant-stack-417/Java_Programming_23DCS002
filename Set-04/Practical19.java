import java.util.Scanner;

class Reactangle {
    int length, breadth;

    Reactangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area Of Reactangle : " + length * breadth);
    }

    void parameter() {
        System.out.println("Parameter Of Reactangle : " + 2 * (length + breadth));
    }

}

class Square extends Reactangle {
    Square(int l) {
        super(l, l);
    }

    void area() {
        System.out.println("Area Of Square : " + length * length);
    }

    void parameter() {
        System.out.println("Parameter Of Square : " + 2 * length);
    }

}

public class Practical19 {
    public static void main(String[] args) {

        Reactangle r[] = new Reactangle[5];
        Square s[] = new Square[5];
        Scanner scan = new Scanner(System.in);

        int i, l, b;
        for (i = 0; i < 5; i++) {
            System.out.println("Enter Length For " + (i + 1) + " Reactangle : ");
            l = scan.nextInt();
            System.out.println("Enter Breadth For " + (i + 1) + " Reactangle : ");
            b = scan.nextInt();

            r[i] = new Reactangle(l, b);

            r[i].area();
            r[i].parameter();

            System.out.println("Enter Length For " + (i + 1) + " Square : ");
            l = scan.nextInt();
            s[i] = new Square(l);
            s[i].area();
            s[i].parameter();
            scan.close();
        }
    }
}