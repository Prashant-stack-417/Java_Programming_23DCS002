class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("user Thread");
        }
    }
}

public class test1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("Main Thread");
        }

    }
}