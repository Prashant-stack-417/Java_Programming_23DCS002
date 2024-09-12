class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("0-user Thread");
        }
        run(10);
    }

    public void run(int x) {
        for (int i = 0; i < 3; i++) {
            System.out.println("1-user Thread");
        }
    }
}

public class test5 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("Main Thread");
        }

    }
}