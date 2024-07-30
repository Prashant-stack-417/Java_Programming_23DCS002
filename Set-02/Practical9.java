import java.util.Scanner;

public class Practical9 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = s1.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c + "" + c);
        }
        s1.close();
    }
}
