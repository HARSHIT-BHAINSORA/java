
class Display{
    public synchronized void wish(String name)
    {
        System.out.println("Hello Java...");

        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println("Error Occur - " + e);
        }

        System.out.println("Name is - " + name);
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

public class Person {

    public static void main(String args[]){
        Display d = new Display();
    
        Mythread th1 = new Mythread(d , "Sumit");
        Mythread th2 = new Mythread(d , "Mohit");

        th1.start();
        th2.start();
    }
}
