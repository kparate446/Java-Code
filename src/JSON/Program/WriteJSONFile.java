package JSON.Program;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONFile {
	public static void main(String[] args) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("Name", "Krunal Parate");
		obj.put("Location", "Nagpur");
		
		JSONArray list = new JSONArray();
		list.add("Java");
		list.add("Spring");
		list.add("Hybernate");
		obj.put("Courses", list);
		
		FileWriter file = new FileWriter("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/myJSON.json");
		
			file.write(obj.toString());
			file.flush();
		
//		catch(IOException e){
//			e.printStackTrace();
//		}
		System.out.println(obj);
	}
}
