// Using Command line - input take from console in rumtime .

class Student {
    String name;
    int rollNo;
    String unversityName;
    String branch;

    void display() {
        System.out.println(name + " " + rollNo + " " + unversityName + " " + branch);
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.name = args[0];
        s.rollNo = Integer.parseInt(args[1]);
        s.unversityName = args[2];
        s.branch = args[3];

        s.display();
    }

}
