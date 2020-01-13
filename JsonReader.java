import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader
{
    public static void main(String [] args)
    {
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("teamsList.json"))
        {

            JSONArray teamList = (JSONArray) jsonParser.parse(reader);
            System.out.println(teamList);


        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }

        

    }
}