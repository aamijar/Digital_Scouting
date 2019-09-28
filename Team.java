public class Team {
    
    private String teamNumber;
    private String teamName;
    private String homeDistrict;
    private int [] teamStats;
    
    Team(String name, String number, String district, int [] stats)
    {
        teamName = name;
        teamNumber = number;
        homeDistrict = district;
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
    public int [] getStats()
    {
        return teamStats;
    }
}