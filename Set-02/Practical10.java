import java.util.Scanner;

class Practical10 {
    public static void main(String[] args) {
        String a;
        int i, j;
        char ch1;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String : ");
        a = s.nextLine();
        s.close();

        char[] c = a.toCharArray();

        System.out.println("String Length = " + a.length());
        System.out.println("Lower String = " + a.toLowerCase());
        System.out.println("Upper String = " + a.toUpperCase());
        System.out.println("Reversed String = ");
        for (i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println("\nSorted String = ");
        for (i = 0; i < a.length() - 1; i++) {
            for (j = 0; j < a.length() - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    ch1 = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = ch1;
                }
            }
        }

        for (i = 0; i < a.length(); i++) {
            System.out.print(c[i]);

        }
    }
}