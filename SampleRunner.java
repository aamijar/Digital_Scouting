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
        ArrayList<String> sheetArrRead = new ArrayList<String>(FileManager.readFile(filePath));
        System.out.println("Read File:" + sheetArrRead);
        
        //define temporary index system to interperet sheetArrRead
        //0 = teamName ex. Hitchhikers
        //1 = teamNumber ex. 2059
        //2 = teamHomeDistrict ex. FNC
        //3 = totalMatchPointsScored ex. 20
        //4 = matchResult, True = win, False = loss ex. True
        boolean matchResult;
        int [] stats = {}; //empty arr for now
        if(sheetArrRead.get(4).equals("true"))
        {
            matchResult = true;
        }
        else
        {
            matchResult = false;
        }

        Team frc2059 = new Team(sheetArrRead.get(0), sheetArrRead.get(1), sheetArrRead.get(2),stats);
        //Team frc2059 = new Team("Hitchhikers", "2059", "FNC",stats);
        Match frc2059m1 = new Match(frc2059, Integer.parseInt(sheetArrRead.get(3)), matchResult);


        System.out.println(frc2059m1.getTeam().getTeamNumber());
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