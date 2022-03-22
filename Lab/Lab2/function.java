
class Function{
    int marks;
    String name ;
    int rollNo;

    void setData(int marks , String name , int rollNo)
    {
        this.marks = marks;
        this.name = name ;
        this.rollNo = rollNo;
        display(); // expicitly call . call object fucntion
    }
    void display(){
        System.out.println(name + " " + marks + " " + rollNo );
    }

    public static void main(String args[])
    {
        Function obj = new Function();
        obj.setData(90 , "harshit" , 29);
    }
};