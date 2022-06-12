import java.util.*;

public class ExceptionHandling {
    
    public static void main(String args[]){
        try{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend =");
        int a = sc.nextInt();
    
        System.out.println("Enter the Divisor = ");
        int b = sc.nextInt();
        
        int c = a / b;
        System.out.println("Division is -" + c);
        sc.close();
    }
    catch(ArithmeticException e)
    {
        System.out.println("Error Ocurrs - " + e.getMessage());
        System.out.println("Divison by Zero is not possible...");
    }
    }   
}
