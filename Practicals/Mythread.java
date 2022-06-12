
class Thread1 extends Thread{
    public void run(){
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("Thread I - " + i);
        } 
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.println("Thread II - " + i);
        } 
    }
}

class Thread3 extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.println("Thread III - " + i);
        } 
    }
}


public class Mythread {
    public static void main(String args[])
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}