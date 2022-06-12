import java.util.*;

class LowBalanceException extends Exception{
    public LowBalanceException(String msg)
    {
        super(msg);
    }
}

class Bank {
    int bal = 1000;
    public void withdrawal(int amt) throws LowBalanceException
        {
            if(bal < amt)
            {
                throw new LowBalanceException("Insuffcient balance");
            }

            bal = bal - amt;
            System.out.println("Succesfully Withdraw money \n Balance Left = " + bal);
        }
}


class User{
    public static void main(String args[]){

        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the Withdraw ammout = ");
            int amt = sc.nextInt();

            b.withdrawal(amt);
        }catch(LowBalanceException e)
        {
            System.out.println("Error Occur - " + e.getMessage());
        }
        sc.close();
    }
}
