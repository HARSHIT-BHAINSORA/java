// Banking System
// Using keyboard
import java.util.Scanner;

class Account {
    int accno;
    String name;
    int amount;

    void insert(int accno, String name, int amount) {
        this.accno = accno;
        this.name = name;
        this.amount = amount;
    }

    void deposit(int d) {
        amount = amount + d;
        System.out.println("Amount succefully deposited");
    }

    void withdraw(int f) {
        if (f > amount)
            System.out.println("Amount can not be withdraw");
        else {
            amount = amount - f;
            System.out.println("Amount succesfully withdraw");
        }
    }

    void checkBalance() {
        System.out.println("The amount=" + amount);
    }

    void display() {
        System.out.println("Account Number - " + accno + " Cilent - " + name + " Amount -" + amount);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter the Your Account Number");
        int accno = sc.nextInt();

        System.out.println("Enter your amount");
        int amount = sc.nextInt();

        Account p = new Account();
        p.insert(accno, name, amount);

        System.out.println(" 0. exit \n 1.deposit \n 2.withdraw \n 3.checkBalance \n 4.display");
        int ch;
        do {

            System.out.println("Enter your Choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the amount you want to deposit");
                    int d = sc.nextInt();
                    p.deposit(d);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw");
                    int w = sc.nextInt();
                    p.withdraw(w);
                    break;
                case 3:
                    p.checkBalance();
                    break;
                case 4:
                    p.display();
                    break;

            }
        } while (ch != 0);

        sc.close();
    }

}