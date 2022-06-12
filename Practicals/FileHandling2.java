import java.io.*;

public class FileHandling2 
{

    public static void main(String[] args) 
    {
        try{
            
            FileReader fr = new FileReader("demo1.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("demo2.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            int x ;
            while((x = br.read()) != -1){
                bw.write((char)x);
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occur " + e);
        }
    }
}
     
    