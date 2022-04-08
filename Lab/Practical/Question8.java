// Constructor chaining 

class Student {
    int id;
    String name;
    String branch;
    String city;
    String university;

    Student(int id, String name, String branch, String city, String university) {
        this(name, branch, city, university);
        this.id = id;
    }

    Student(String name, String branch, String city, String university) {
        this(branch, city, university);
        this.name = name;
    }

    Student(String branch, String city, String university) {
        this(city, university);
        this.branch = branch;
    }

    Student(String city, String university) {
        this(university);
        this.city = city;
    }

    Student(String university) {
        this.university = university;
    }

    void showDetails() {
        System.out.println(id + " " + name + " " + branch + " " + city + " " + university);
    }

    public static void main(String args[]) {
        Student s = new Student(2183283, "Harshit", "CSE", "Almora", "GEHU");
        s.showDetails();
    }
}