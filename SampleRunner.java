import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class SampleRunner
{
    public static void main(String [] args) throws IOException
    {
        
        //initialize .txt filepath on local disk, temp location
        String filePath = "C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\sample.txt";


        //simulate text entries from app scout sheet
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a scout sheet.");
        String str = sc.nextLine();

        //write one scout sheet to file
        ArrayList<String> sheetArr = new ArrayList<String>(splitToArrayList(str));
        System.out.println("Write File:" + sheetArr);

        //read one scout sheet from file
        FileManager.writeFile(sheetArr);
        ArrayList<String> sheetArrFile = new ArrayList<String>(FileManager.readFile(filePath));
        System.out.println("Read File:" + sheetArrFile);
        
        sc.close();
    }

    public static ArrayList<String> splitToArrayList(String str)
    {
        ArrayList<String> strList = new ArrayList<String>();
        String splitStr = "";
        for(int i = 0; i < str.length(); i ++)
        {
            if(str.substring(i, i + 1).equals(","))
            {
                strList.add(splitStr);
                splitStr = ""; 
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