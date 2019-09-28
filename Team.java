import java.util.ArrayList;

public class Team {
    
    private String teamNumber;
    private String teamName;
    private String homeDistrict;
    private ArrayList<Match> matches;
    private int [] teamStats;
    
    Team(String name, String number, String district, ArrayList<Match> mList, int [] stats)
    {
        teamName = name;
        teamNumber = number;
        homeDistrict = district;
        matches = mList;
        teamStats = stats;
    }
    
    
    
    public String getTeamNumber()
    {
        return teamNumber;
    }
    public String getTeamName()
    {
        return teamName;
    }
    public String getHomeDistrict()
    {
        return homeDistrict;
    }
    public ArrayList<Match> getMatches()
    {
        return matches;
    }
    public int [] getStats()
    {
        return teamStats;
    }
}