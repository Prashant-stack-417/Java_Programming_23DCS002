public class exception2 {
    public static void main(String[] args) {
        // int a[] = { 0, 1, 2 };
        // try {
        // System.out.println(a[3]);
        // }
        // catch(ArrayIndexOutOfBoundsException ab)
        // {
        // System.out.println("hello");
        // }catch (Exception e) {
        // System.out.println("handeld" + e);
        // }

        int a = 3, b = 0, c, arr[] = { 0, 1, 2 };
        String s = "Charusat";
        String s1 = null;
        // try {
        // c = a / b;
        // System.out.println(arr[3]);
        // System.out.println(s.charAt(9));
        // System.out.println(s1.length());

        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array");
        // } catch (StringIndexOutOfBoundsException e) {
        // System.out.println("String");
        // } catch (ArithmeticException e) {
        // System.out.println("Arithmetic");
        // } catch (NullPointerException e) {
        // System.out.println();
        // }

        try {
            try {
                c = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic");
            }
            try {
                System.out.println(arr[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array");
            }
            try {
                System.out.println(s.charAt(9));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String");
            }
            try {
                System.out.println(s1.length());
            } catch (NullPointerException e) {
                System.out.println("null");
            }

        } catch (Exception e) {

            System.out.println("Anything ");
        }
    }
}