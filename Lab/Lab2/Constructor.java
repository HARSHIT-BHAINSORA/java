class Constructor{
    static int x = 0;
    Constructor(){
        ++x;
    }

    public static void main(String args[])
    {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor();
        Constructor obj3 = new Constructor();

        System.out.println(x);
    } 
};