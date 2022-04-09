

class Shape {

    double area;

    void area(int length, int breadth) {
        area = length * breadth; // area of rectangle
    }

    void area(float half, int base, int height) {
        area = half * base * height; // area of triangle
    }

    void area(int radius) {
        area = 3.14 * radius * radius; // area of circle
    }

    void display() {
        System.out.print("Area is = " + area);
        System.out.println();
    }

    public static void main(String args[]) {
        Shape s = new Shape();
        s.area(2, 4);
        s.display();
        s.area(0.2f, 4, 6);
        s.display();
        s.area(4);
        s.display();
    }
}
