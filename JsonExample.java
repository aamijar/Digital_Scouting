import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonExample
{
    @SuppressWarnings("unchecked")
    public static void main(String [] args) throws Exception
    {
        //first team
        
        JSONObject teamDetails = new JSONObject();
        teamDetails.put("teamName", "Hitchhikers");
        teamDetails.put("teamNumber", "2059");
        
        JSONObject teamObject = new JSONObject();
        teamObject.put("frcteam", teamDetails);

        //second team

        JSONObject teamDetails2 = new JSONObject();
        teamDetails2.put("teamName", "Platypi");
        teamDetails2.put("teamNumber", "2655");
        
        JSONObject teamObject2 = new JSONObject();
        teamObject2.put("frcteam", teamDetails2);

        JSONArray teamList = new JSONArray();
        teamList.add(teamObject);
        teamList.add(teamObject2);

        //Write JSON File

        try(FileWriter file = new FileWriter("teamsList.json"))
        {
            //file.write(teamList.toJSONString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();


        }
        writeJsonFile("example.json");


    }
    
    @SuppressWarnings("unchecked")
    public static void writeJsonFile(String name) throws Exception
    {
        
        
        JSONObject teamProfile = new JSONObject();
        teamProfile.put("teamName", "Hitchhikers");
        teamProfile.put("teamNumber", "2059");


        JSONObject teamProfile2 = new JSONObject();
        teamProfile2.put("teamName", "Platypi");
        teamProfile2.put("teamName", "2655");

        JSONArray teamList = new JSONArray();
        teamList.add(teamProfile);
        teamList.add(teamProfile2);


        try(FileWriter file = new FileWriter(name))
        {
            file.write(teamList.toJSONString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();


        }
        



    }





}