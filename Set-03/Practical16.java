class complex {
    int real, imj;

    complex(int r, int i) {
        real = r;
        imj = i;
    }

    void add(complex cx) {
        int SumR = real + cx.real;
        int SumI = imj + cx.imj;
        System.out.println("Your SumR is:" + SumR);
        System.out.println("Your SumI is:" + SumI);
    }

}

public class Practical16 {
    public static void main(String[] args) {
        complex C1 = new complex(5, 6);
        complex C2 = new complex(7, 8);
        C1.add(C2);

    }
}
