import java.io.*;
public class Types{
    public static void main(String args[])
    {
        try{
            System.out.println("Enter Your Name - ");

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            FileWriter fw = new FileWriter("Demo.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            int ch;
            while((ch = br.read()) != '\n'){
                bw.write((char) ch);
            }

            isr.close();
            br.close();
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}