// constructor chaining

class Number{
    int num ;

    Number(){
        this(7); // implicity done this of calling object.
        System.out.println("Constructor first");
    }

    Number(int x){
        this(4 , 2);
        System.out.println("Constructor Second");
        System.out.println(x);
    }

    Number(int a , int b){
        System.out.println("Constructor Thrid");
        System.out.println(a + " " + b);
    }

    public static void main(String args[]){
        Number n = new Number();
    }
}