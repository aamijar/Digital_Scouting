import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class SampleRunner
{
    public static void main(String [] args) throws IOException
    {
        // String [] statsArr = {"frc2059","frc5190","frc2655"};
        // FileManager.writeFile(statsArr);

        // String filePath = "C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\sample.txt";
        // FileManager.readFile(filePath);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a scout sheet.");
        String str = sc.nextLine();

        System.out.println(splitToArrayList(str));

        // String str1 = "Yes, Please";
        // String [] strArr = str1.split(",");
        // System.out.println(strArr);
        //ArrayList<String> test = new ArrayList<String>();
        sc.close();
    }

    public static ArrayList<String> splitToArrayList(String str)
    {
        ArrayList<String> strList = new ArrayList<String>();
        String splitStr = "";
        for(int i = 0; i < str.length() - 1; i ++)
        {
            if(str.substring(i, i + 1).equals(","))
            {
                strList.add(splitStr);    
            }
            else
            {
                splitStr = splitStr + str.substring(i,i + 1);
            }
        }
        strList.add(splitStr);
        return strList;
    }

}