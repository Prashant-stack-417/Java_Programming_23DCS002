
public class exception1 {
    public static void main(String[] args) {
        int a = 25, b = 0,c;
        System.out.println("before");
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("10/0");
            System.exit(0);
        }
        System.out.println("End");

        // System.out.println("After");

        // int a[] = { 0, 1, 2 };
        // try {
        // System.out.println(a[3]);
        // } catch (Exception e) {
        // System.out.println("handeld " + e);
        // }

        // String s = "Charusat";
        // try {
        // System.out.println(s.charAt(9));
        // } catch (Exception e) {

        // System.out.println("Handeled " + e);
        // }

        // String s1 = null;
        // try
        // {
        // System.out.println(s1.length());
        // }
        // catch(Exception e)
        // {
        // System.out.println("handeled " + e);

        // }
    }
}
