// using static with Scanner class & this.

import java.util.Scanner;
class Student{

    String name;
    int rollNo;
    static String university = "GEHU";
    String branch;

    void setData(String name , int rollNo , String branch)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    void display()
    {
        System.out.println(name + " " + rollNo + " " + university + " " + branch);
    }

    public static void main(String args[])
    {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int rollNo = sc.nextInt();
        String branch = sc.next();

        s.setData(name , rollNo , branch);
        s.display();
        sc.close();

    }
   
};