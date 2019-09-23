
public class Team {
    
    private int teamNumber;
    private String teamName;
    private String homeDistrict;

    private int wins;
    private int losses;
    private int pointsScored;
    private int [] teamStats;
    Team(int number, String name, String district, int [] stats)
    {
        teamNumber = number;
        teamName = name;
        homeDistrict = district;
        teamStats = stats;
    }
    public int getTeamNumber()
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
    public int [] getStats()
    {
        return teamStats;
    }
}