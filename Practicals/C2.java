package pack2;
import pack1.*;

public class C2 extends C1 implements I1{
    
    public int division (int a , int b){
        return b / a;
    }
    
    public static void main(String args[]){
        
        C2 obj  = new C2();

        System.out.println("The sum is = " + obj.sum(2 , 6));
        System.out.println("The division is = " + obj.division(2 , 6));
        System.out.println("The subtraction is = " + obj.sub(2 , 6));
    }

}
