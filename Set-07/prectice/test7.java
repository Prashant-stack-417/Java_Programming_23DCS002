
class MyThread extends Thread {
    public void start() {
        System.out.println("Hello");
    }
}

public class test7 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("Main");
    }

}
