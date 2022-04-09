// not Dynamic

class Student {
    
    String name ;
    int id;
    String unversityName;
    String branch; 

    void setDetails(String name, int id, String unversityName, String branch) {
        this.name = name;
        this.id = id;
        this.unversityName = unversityName;
        this.branch = branch;
    }

    void showDetails() {
        System.out.println(name + " " + id + " " + unversityName + " " + branch);
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.setDetails("Harshit", 29, "GEHU", "CSE");
        s.showDetails();
    }
}