import java.io.IOException;
import java.io.PrintWriter;


public class WriteFile
{
    public static void main(String [] args) throws IOException
    {
        System.out.println("Hello World!");
        PrintWriter writer = new PrintWriter("samplewrite.txt", "UTF-8");
        writer.println("frc2059");
        writer.println("frc5190");
        writer.close();
    }
}
