// not Dynamic

class Student {
    

    void set(String name, int rollNo, String unversityName, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.unversityName = unversityName;
        this.branch = branch;
    }

    void display() {
        System.out.println(name + " " + rollNo + " " + unversityName + " " + branch);
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.set("Harshit", 29, "GEHU", "CSE");
        s.display();
    }
}