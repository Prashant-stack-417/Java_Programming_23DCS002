import java.util.Scanner;

class Member {
    String name, address;
    int age, salary;
    long phone;
    Scanner scan = new Scanner(System.in);

    void printSalary() {
        System.out.println("Salary = " + salary);
    }

    void getdata() {
        System.out.println("Enter Name : ");
        name = scan.nextLine();
        System.out.println("Enter Address : ");
        address = scan.nextLine();
        System.out.println("Enter Age : ");
        age = scan.nextInt();
        System.out.println("Enter Salary : ");
        salary = scan.nextInt();
        System.out.println("Enter Phone : ");
        phone = scan.nextLong();
    }

    void putdata() {

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Phone : " + phone);
    }
}

class Employee extends Member {
    String specialization;

    void getdata() {
        super.getdata();
        scan.nextLine();
        System.out.println("Enter Specialization : ");
        specialization = scan.nextLine();
    }

    void putdata() {
        super.putdata();
        System.out.println("Specialization : " + specialization);
        System.out.println("----------------------------------------------------------------------");

    }
}

class Manager extends Member {
    String department;

    void getdata() {
        super.getdata();
        scan.nextLine();
        System.out.println("Enter Department : ");
        department = scan.nextLine();
    }

    void putdata() {
        super.putdata();
        System.out.println("Department : " + department);
        System.out.println("----------------------------------------------------------------------");

    }
}

public class Practical18 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Manager m1 = new Manager();

        e1.getdata();
        e1.putdata();

        m1.getdata();
        m1.putdata();

    }
}