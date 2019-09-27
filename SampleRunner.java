import java.io.IOException;
public class SampleRunner
{
    public static void main(String [] args) throws IOException
    {
        String [] statsArr = {"frc2059","frc5190","frc2655"};
        FileManager.writeFile(statsArr);

        String filePath = "C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\sample.txt";
        FileManager.readFile(filePath);
    }
}