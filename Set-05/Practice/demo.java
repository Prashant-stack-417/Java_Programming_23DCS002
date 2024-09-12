class Test {
    void m1() throws InterruptedException{
        m2();
    }

    void m2() throws InterruptedException {

        m3();
    }

    void m3() throws InterruptedException {
        System.out.println("hi");
        Thread.sleep(2000);
        System.out.println("Hello");
    }
}

public class demo {
    public static void main(String[] args) throws InterruptedException {
        Test t1 = new Test();
        t1.m1();
    }
}
