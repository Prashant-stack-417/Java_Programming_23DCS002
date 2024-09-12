
class MyThread extends Thread{
    int n;
    MyThread(int n){
        this.n=n;
    }
    
    public void run()
    {
        System.out.println("Produce : "+ n);
    }
}

public class prec37 {
    public static void main(String[] args) {
        
    }
}
