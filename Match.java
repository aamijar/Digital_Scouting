public class Match
{
    private Team frcTeam;
    private int pointsScored;
    private boolean matchResult;


    public Match(Team team, int points, boolean result)
    {
        frcTeam = team;
        pointsScored = points;
        matchResult = result;
    }

    public Team getTeam()
    {
        return frcTeam;
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