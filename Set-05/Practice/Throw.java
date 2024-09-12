class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class Throw {
    public static void main(String[] args) {
        System.out.println("user define message");
        try {
            throw new MyException("Java user defined exception");
            // throw new Exception();
            // throw new Exception("base exception class message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // System.out.println("Exception Caught Successfully");
        }
    }
}