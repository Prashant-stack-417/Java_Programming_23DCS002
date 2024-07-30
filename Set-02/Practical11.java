public class Practical11 {
    public static void main(String[] args) {
        String a = "CHARUSAT UNIVERSITY";

        System.out.println("Length Of String = " + a.length());

        char[] c = a.toCharArray();

        for (int i = 0; i < a.length(); i++) {
            if (c[i] == 'H') {
                c[i] = 'R';
            }

        }

        for (int i = 0; i < a.length(); i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nLowered String = ");
        for (int i = 0; i < a.length(); i++) {
            if (c[i] >= 'A' && c[i] < 'Z') {
                c[i] += 32;

            }
            System.out.print(c[i]);

        }
    }
}
