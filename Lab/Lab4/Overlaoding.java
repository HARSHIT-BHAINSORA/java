// Overloading of method in java

class Area{

    int area;

    void area(int l , int b)
    {
        area = l * b;
    }

    void area(int side)
    {
        area = side * side;
    }

    void area(int l , int b , int h)
    {
        area = l * b * h;
    }

    void display()
    {
        System.out.print("Area is = " + area);
    }

}

class Main{
    Area a = new Area();
    a.area(2 , 4);
    a.display();
    a.area(3);
    a.display();
    a.area(3 ,4 ,5);
    a.display();
}