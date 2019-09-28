public class Match
{
    private String teamName;
    private int matchNumber;
    private int pointsScored;
    private boolean matchResult;


    public Match(String name, int number, int points, boolean result)
    {
        teamName = name;
        matchNumber = number;
        pointsScored = points;
        matchResult = result;
    }

    public String getTeamName()
    {
        return teamName;
    }
    public int getMatchNumber()
    {
        return matchNumber;
    }
    public int getMatchPoints()
    {
        return pointsScored;
    }
    public boolean getMatchResult()
    {
        return matchResult;
    }
}