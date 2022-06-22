/* 1. diver
2. class path
3. db
4.show Databases;
5. use sys;
6.create table emp(id int , name varchar(20));
7.desc emp
*/
import java.sql.*;
import java.util.Scanner;

public class jdbc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
            System.out.println("Connected to database...");
            int choice = 54; 
            while (choice != 0) {
                System.out.println("1. input values");
                System.out.println("2. display table");
                System.out.println("3. update value");
                System.out.println("4. Delete value");
                System.out.println("0  exit");
                System.out.print("enter your choice: ");
                choice = sc.nextInt();
                int empId;
                String name;
                if (choice == 1) { // submit
                    
                    System.out.print("Enter roll number: ");
                    empId = sc.nextInt();
                    System.out.print("Enter name: ");
                    name = sc.next();
                    
                    PreparedStatement ps = con.prepareStatement("insert into student(roll_number,Name) values(?,?);");
                    ps.setInt(1, empId);
                    ps.setString(2, name);
                    ps.executeUpdate();
                    System.out.println("details added");
                    
                }
                if (choice == 2) {
                    System.out.print("\n");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from student");
                    while (rs.next()) {
                        System.out.print(rs.getInt(1) + " ");
                        System.out.println(rs.getString(2));
                    }
                }
                if (choice == 3) {
                    PreparedStatement ps1 = con.prepareStatement("Update student set Name = ? where roll_number = ?");
                    System.out.print("Enter roll number:");
                    empId = sc.nextInt();
                    System.out.print("Enter new name: ");
                    name = sc.next();

                    ps1.setString(1, name);
                    ps1.setInt(2, empId);
                    ps1.executeUpdate();
                    System.out.println("details updated ");

                }
                if (choice == 4) {
                    System.out.print("enter the roll number: ");
                    empId = sc.nextInt();
                    PreparedStatement ps2 = con.prepareStatement("delete from student where roll_number = ?");
                    ps2.setInt(1, empId);
                    ps2.executeUpdate();
                    System.out.println("details deleted");

                }
            }

        } catch (

        Exception e) {
            System.out.println(e);
        }
    }
}