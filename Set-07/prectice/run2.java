
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("0-Thread Is Running");
        }
        run(10);
    }

    public void run(int x) {
        for (int i = 0; i < 3; i++) {
            System.out.println("1-Thread Is Running");
        }
    }
}

public class run2 {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }

}
