import java.util.*;

class InsufficiantException extends Exception{
    InsufficiantException(String s)
    {
        super(s);
    }
}

public class bankexception {
    public static void main(String[] args) {
        int balance,temp;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Current Balance : ");
        balance = scan.nextInt();

        System.out.println("Enter Withdrawal Amount : ");
        temp=scan.nextInt();

        try {
            if(temp>balance)
            {
                throw new InsufficiantException("Insufficiant Balance");
            }
            else
            {
                System.out.println("Withdraw Successfull");
            }
        } catch (InsufficiantException e) {
            System.out.println(e.getMessage());
        }
    }
}
