import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String s)
    {
        super(s);
    }
}

public class agerestriction {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age : ");
        age=scan.nextInt();

        try {
            if(age<18)
            {
                throw new AgeException("not eligible for voting in 2029");
            }
            else
            {
                System.out.println("Eligible For Voting");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
