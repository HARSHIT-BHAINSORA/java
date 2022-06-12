import java.io.*;

public class FileHandling4 {
    
    public static void main(String args[])
    {
        try {

            FileWriter fw = new FileWriter("demo4.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            InputStreamReader irs = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(irs);

            System.out.println("Enter Your Name - ");

            int ch ;
            while((ch = br.read()) != -1)
            {
                bw.write((char)ch);
            }

            br.close();
            irs.close();
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occurs - " + e);
        }
    }
}
