import java.util.Scanner;
class Employee{
    int Id;
    String name;
    String department;
    int salary;

    Employee(){

    }

    Employee(int id , String name ,String department , int salary){
        this.id = id;
        this.name = name ;
        this.department = department;
        this.salary = salary; 
    }

    void setDetail(int id , String name ,String department , int salary)
    {
        this.id = id;
        this.name = name ;
        this.department = department;
        this.salary = salary;  
    }

    void showDetail()
    {
        System.out.println(id + " " name  + " " + department + " " + salary + " ");
    } 
}

class Main{
    Employee e1 = new Employee();
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name");
    String name = sc.nextLine();

    System.out.println("Enter the Your id");
    int id = sc.nextInt();

    System.out.println("Enter your department");
    String department = sc.nextLine();

    System.out,println("Enter your salary");
    int salary = sc.nextInt();

    set

}