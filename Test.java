import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Test
{
    public static void main(String [] args) throws IOException
    {
        // File dir = new File("C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\TextFiles");
        // File [] dirFiles = dir.listFiles();
        // for(File file : dirFiles)
        // {
        //     String filePath = file.getAbsolutePath();
        //     System.out.println(FileManager.readFile(filePath));
        // }
        ArrayList<String> nums = new ArrayList<String>();
        ArrayList<String> nums2 = nums;

        nums.add("45");
        System.out.println(nums);
        System.out.println(nums2);
    }
}