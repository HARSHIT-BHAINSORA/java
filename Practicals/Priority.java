public class Priority extends Thread{
    
    public void run(){
        System.out.println("Inside run method...");
    }

    public static void main(String args[])
    {
        Priority t1 = new Priority();
        Priority t2 = new Priority();
        Priority t3 = new Priority();

        t1.setName("Thread 1 ");
        System.out.println(t1.getName() + "the priority is - " + t1.getPriority());

        t2.setName("Thread 2 ");
        System.out.println(t2.getName() + "the priority is - " + t2.getPriority());

        t3.setName("Thread 3 ");
        System.out.println(t3.getName() + "the priority is - " + t3.getPriority());
        
        System.out.println(Thread.currentThread().getName() + " the priority is - " + Thread.currentThread().getPriority());

        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(7);
        Thread.currentThread().setPriority(1);

        t1.setName("Thread 1 ");
        System.out.println(t1.getName() + "the priority is - " + t1.getPriority());

        t2.setName("Thread 2 ");
        System.out.println(t2.getName() + "the priority is - " + t2.getPriority());

        t3.setName("Thread 3 ");
        System.out.println(t3.getName() + "the priority is - " + t3.getPriority());
        
        System.out.println(Thread.currentThread().getName() + " the priority is - " + Thread.currentThread().getPriority());
    } 
}