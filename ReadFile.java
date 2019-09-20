import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile
{
    public static void main(String [] args) throws Exception
    {
        File sampleFile = new File("C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\sample.txt");
        
        Scanner sc = new Scanner(sampleFile);
        
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close(); //close the scanner
    }
}