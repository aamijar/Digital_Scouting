
public class Team {
    
    private int teamNumber;
    private String teamName;
    private String homeDistrict;

    private int wins;
    private int losses;
    private int pointsScored;
    Team(int number, String name, String district)
    {
        teamNumber = number;
        teamName = name;
        homeDistrict = district;
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
}