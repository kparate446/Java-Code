package JSON.Program;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/myJSON.json"));
		// It is used in Object to JSON format
		JSONObject jsonObject = (JSONObject) obj;
		String name=(String)jsonObject.get("Name");//key
		System.out.println("Name is: "+name);
		
		String location=(String)jsonObject.get("Location");
		System.out.println("Location is: "+location);
		//Loop Arrays
		JSONArray courseArray = (JSONArray)jsonObject.get("Courses");
		Iterator<String> iterator =courseArray.iterator();
		while(iterator.hasNext()) {
			System.out.println("Course: "+iterator.next());
		}

	}

}
