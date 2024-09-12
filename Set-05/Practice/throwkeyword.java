public class throwkeyword {
    public static void main(String[] args) {
        System.out.println("USer Define");
        // throw new ArithmeticException("HEllo");
        try {
        throw new ArithmeticException("HEllo");
        } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
        }
        System.out.println("after");
    }
}
