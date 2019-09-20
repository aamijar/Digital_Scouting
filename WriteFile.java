
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class WriterFile
{
    public static void main(String [] args) throws IOException
    {
        String filePath = "C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\sample.txt";
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write("Team Name");
        writer.close();
    }
}
