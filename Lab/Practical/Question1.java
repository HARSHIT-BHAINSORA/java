// not Dynamic

class Student {
    
    String name ;
    int rollNo;
    String unversityName;
    String branch; 

    void setDetails(String name, int rollNo, String unversityName, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.unversityName = unversityName;
        this.branch = branch;
    }

    void showDetails() {
        System.out.println(name + " " + rollNo + " " + unversityName + " " + branch);
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.setDetails("Harshit", 29, "GEHU", "CSE");
        s.showDetails();
    }
}