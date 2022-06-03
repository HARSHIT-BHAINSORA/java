
class Display{
    
    public void wish(String name);
    {
        for(int i = 0 ; i <= 4 ; i++)
        {
            System.out.println("Hello java...");
            try {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.outprintln("The name of = " + name);
        } 
    }
}

class Mythread extends Thread{

    Display d;
    String name;

    Mythread(Display d , String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }
}


public class Demo{
    public static void main(String args[])
    {
        Display d = new Display();
        Mythread t1 = new Mythread(d , "sumit");
        Mythread t2 = new Mythread(d , "ankit");

        t1.start();
        t2.start();
    }
}