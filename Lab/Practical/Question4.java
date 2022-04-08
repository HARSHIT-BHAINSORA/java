import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee() {

    }

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void setDetails(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println(id + " " + name + " " + department + " " + salary + " ");
    }
}

class Main {

    public static void main(String args[]) {

        Employee e1 = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter the Your id");
        int id = sc.nextInt();

        System.out.println("Enter your department");
        String department = sc.next();

        System.out.println("Enter your salary");
        int salary = sc.nextInt();

        e1.setDetails(id, name, department, salary);
        e1.showDetails();

        Employee e2 = new Employee(2001831, "Sumit", "wipro", 55000);
        e2.showDetails();

        sc.close();
    }

}