// Consturctor reuses by super keyword

class Number{
    int n1 , n2 , n3 ;

    Number(int n1 , int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
}

class Main extends Number{
    Main(int n1 , int n2 , int n3)
    {
        super(n1 , n2);
        this.n3 = n3;
    }

    public static void main(String args[])
    {
        Main obj = new Main(2 , 3, 4);
        System.out.println(obj.n1 + " " + obj.n2 + " " + obj.n3);
    }
}