// Constructor Chaining 
// Note :- you have at least one constructor to terminate call / avoid recursive call.

class Number{
    int n1 , n2 , n3 , n4;

    Number(int n1 , int n2 , int n3 , int n4)
    {
        this(n1 , n2 , n3);
        this.n4 = n4;
    }

    Number(int n1 , int n2 , int n3)
    {
        this(n1,n2);
        this.n3 = n3;
    }

    Number(int n1 , int n2)
    {
        this(n1);
        this.n2 = n2;
    }

    Number(int n1)
    {
        this.n1 = n1;
    }

    void display()
    {
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }

    public static void main(String args[])
    {
        Number num = new Number(4 , 5, 7, 9);
        num.display();
    }
}