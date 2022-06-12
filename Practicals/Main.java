
class Account{
    int bal = 100;
    
    public synchronized void withdraw(int amt){
        System.out.println("Customer trying to withdraw amount ...." + amt);

        if(this.bal < amt)
        {
            System.out.println("Insufficent amount... wait");
        }
        
        try{
            wait();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
        
        this.bal = this.bal - amt;
        System.out.println("The current balance after Withdraw is - " + this.bal);
        

    }

    public synchronized void deposite(int amt)
    {
        System.out.println("Customer trying to deposite money ..." + amt);

        this.bal = this.bal + amt;
        System.out.println("The current Balance after Deposite is - " + this.bal);
        
        try{
            notify();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Customer1 extends Thread{

    Account a = new Account();
    int amt;
    
    Customer1(Account a ,int amt){
        this.a = a ;
        this.amt = amt;
    }

    public void run(){
        a.withdraw(amt);
    }
}

class Customer2 extends Thread{
    Account a = new Account();
    int amt ;

    Customer2(Account a , int amt){
        this.a = a;
        this.amt = amt;
    }
    public void run(){
        a.deposite(amt);
    }
}

public class Main {
    public static void main(String args[])
    {
        Account a = new Account();
        Customer1 c1 = new Customer1(a ,400);
        Customer2 c2 = new Customer2(a, 500);

        c1.start();
        c2.start();

    }
}
