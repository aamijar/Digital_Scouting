/**
 * @author Anupam M.
 * 
 * 
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class SampleRunner
{
    public static void main(String [] args) throws IOException
    {
        
        //initialize .txt filepath on local disk, temp location
        String filePath = "C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\sample.txt";
        String dirPath = "C:\\Users\\aamij\\Documents\\Hitchhikers\\Code\\Digital_Scouting\\TextFiles";

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
        
        /*
        define temporary index system to interperet sheetArrRead
        0 = teamName ex. Hitchhikers
        1 = teamNumber ex. 2059
        2 = teamHomeDistrict ex. FNC
        3 = matchNumber ex. 1
        4 = totalMatchPointsScored ex. 20
        5 = totalRankPoints ex. 2
        6 = matchResult, True = win, False = loss ex. True
        */
        //int [] stats = {}; //placeholder

        ArrayList<Team> frcMatches = readData(dirPath);
        System.out.println("total teams: " + frcMatches.size());
        System.out.println(frcMatches.get(0).getRankPointAvg());
        System.out.println(frcMatches.get(1).getMatches());
        System.out.println(frcMatches.get(2).getMatches());

        System.out.println(frcMatches.get(0).getMatches().get(1).getMatchResult());

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
    public static ArrayList<Team> readData(String path) throws IOException
    {
        ArrayList<Match> matches = new ArrayList<Match>();
        
        File dir = new File(path);
        File [] dirFiles = dir.listFiles();
        for(File file : dirFiles)
        {
            String filePath = file.getAbsolutePath();
            ArrayList<String> teamData = FileManager.readFile(filePath);
            boolean matchResult;
            if(teamData.get(6).equals("true"))
            {matchResult = true;}
            else
            {matchResult = false;}
            
            matches.add(new Match(teamData.get(0), Integer.parseInt(teamData.get(3)),Integer.parseInt(teamData.get(4)), Double.parseDouble(teamData.get(5)), matchResult));
        }
        return createTeams(path, matches);
    }


    //helper method
    private static ArrayList<Team> createTeams(String path, ArrayList<Match> mlist) throws IOException
    {
        ArrayList<String> usedTeams = new ArrayList<String>();
        ArrayList<Team> teamList = new ArrayList<Team>();
        int [] stats = {0,0,0}; //placeholder
        File dir = new File(path);
        File [] dirFiles = dir.listFiles();
        for(File file : dirFiles)
        {
            boolean teamDone = false;
            String filePath = file.getAbsolutePath();
            ArrayList<String> teamData = FileManager.readFile(filePath);
            ArrayList<Match> currentTeamMatches = new ArrayList<Match>();
            for(String s : usedTeams)
            {
                
                if(teamData.get(0).equals(s))
                {teamDone = true;}
            }
            
            for(Match m : mlist)
            {
                if(teamData.get(0).equals(m.getTeamName()))
                {currentTeamMatches.add(m);}
            }
            usedTeams.add(teamData.get(0));
            
            if(!teamDone)
            {teamList.add(new Team(teamData.get(0), teamData.get(1), teamData.get(2), currentTeamMatches, stats));}
            
        }
        return teamList;
    }
    // public static ArrayList<Team> sortByDistrictPoints(ArrayList<Team> teams)
    // {
        
    // }

}