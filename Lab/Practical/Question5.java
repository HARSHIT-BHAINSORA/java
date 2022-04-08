class Student {

    String name;
    int rollNo;
    static String unversityName = "Gehu";
    String branch;

    void setDetails(String name, int rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;

        this.branch = branch;
    }

    void showDetails() {
        System.out.println(name + " " + rollNo + " " + unversityName + " " + branch);
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.setDetails("Harshit", 29, "CSE");
        s.showDetails();
    }
}