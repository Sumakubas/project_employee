import java.util.Scanner;

class employee extends department {
    String emp_name;
    String doj;
    int id;

    void getdetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name");
        emp_name = s.nextLine();
        System.out.println("Enter date of join");
        doj = s.nextLine();
        System.out.println("Enter the department id");
        id = s.nextInt();
    }

    void display() {
        department d = new department();
        System.out.println("Employee name is " + emp_name);
        System.out.println("Date of join is " + doj);
        d.dept(id);
    }

    public static void main(String args[]) {
        employee e = new employee();
        e.getdetails();
        e.display();
    }
}
