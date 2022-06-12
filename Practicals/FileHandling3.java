import java.io.*;

public class FileHandling3 {

    public static void main(String args[])
    {
        try{

            FileReader fr = new FileReader("demo3.txt");
            BufferedReader br = new BufferedReader(fr);

            StringBuffer sb = new StringBuffer();

            String line ;

            while((line = br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }

            br.close();
            fr.close();

            System.out.println("File Content is - ");
            System.out.println(sb);

        }
        catch(Exception e)
        {
            System.out.println("Error Occurs - " + e);
        }
    }
    
}
