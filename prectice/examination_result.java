import java.util.Scanner;

class Student {
    int rollnumber;
    String name;
    Scanner scan = new Scanner(System.in);

    public void getdata() {
        System.out.print("Enter Name:");
        name = scan.nextLine();

        System.out.print("Enter Roll number:");
        rollnumber = scan.nextInt();
    }

    public void putdata() {
        System.out.println("\nName:" + name);
        System.out.println("Roll No.:" + rollnumber);
    }

}

class Exam extends Student {
    int marks[] = new int[6];

    public void getdata() {
        super.getdata();
        for (int i = 0; i < 6; i++) {
            System.out.print("\nEnter marks for subject " + (i + 1) + "marks out of 50:");
            marks[i] = scan.nextInt();
        }
    }
}

class Result extends Exam {
    int total_marks = 0;

    void total_marks() {
        super.putdata();
        for (int i = 0; i < 6; i++) {
            total_marks += marks[i];
        }
        System.out.println("Total marks: " + total_marks);
    }
}

public class examination_result {

    public static void main(String[] args) {
        Result r1 = new Result();
        r1.getdata();
        r1.total_marks();
    }
}