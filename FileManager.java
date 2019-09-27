import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;

public class FileManager
{
    public static void writeFile(ArrayList<String> stats) throws IOException
    {
        PrintWriter writer = new PrintWriter("samplewrite.txt", "UTF-8");
        
        for(int i = 0; i < stats.size(); i ++)
        {
            writer.println(stats.get(i));    
        }

        writer.close();
    }

    public static void readFile(String path) throws IOException
    {
        File sampleFile = new File(path);
        
        Scanner sc = new Scanner(sampleFile);
        
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();  
    }

}