import java.io.*;

public class FileHandling1 {
    public static void main(String args[]) 
    {
        try{
        FileInputStream fis = new FileInputStream("demo1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int ch ;
        String s = "";

        while((ch = bis.read()) != -1)
        {
            s += (char)ch;
        } 

        bis.close();
        fis.close();
    
        FileOutputStream fos = new FileOutputStream("demo2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte b[] = s.getBytes();

        bos.write(b);
        
        bos.close();
        fos.close();
    }catch(Exception e)
    {
        System.out.println("Exception Ocuurs " + e);
    }

        
    }
}
