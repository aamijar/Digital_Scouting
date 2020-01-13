import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonExample
{
    public static void main(String [] args)
    {
        //first team
        
        JSONObject teamDetails = new JSONObject();
        teamDetails.put("teamName", "Hitchhikers");
        teamDetails.put("teamNumber", "2059");
        
        JSONObject teamObject = new JSONObject();
        teamObject.put("team", teamDetails);

        //second team

        JSONObject teamDetails2 = new JSONObject();
        teamDetails2.put("teamName", "Platypi");
        teamDetails2.put("teamNumber", "2655");
        
        
    }
    

}