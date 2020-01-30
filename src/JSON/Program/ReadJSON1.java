package JSON.Program;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//passing file to jason.json
		Object obj = new JSONParser().parse(new FileReader("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/myJSON1"));
		
		//typecasting Obj to JSONObject
		JSONObject jo = (JSONObject) obj;
		//getting firstName & lastName
		String firstName=(String)jo.get("firstName");
		String lastName=(String)jo.get("LastName");
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		//getting age
		long age =(long)jo.get("Age");
		System.out.println("Age : "+age);
		//getting Address
		
		
		Map address = ((Map)jo.get("address"));
		//Iteration address Map
		Iterator<Map.Entry> itr1 = address.entrySet().iterator();//return the collection view
		while(itr1.hasNext()) { //return true or false
			Map.Entry pair = itr1.next();
			System.out.println(pair.getKey()+ " : "+pair.getValue());
			
		}
		
		//getting phone Numbers
		JSONArray ja =(JSONArray) jo.get("Phone Numbers");
		
		// iterating PhoneNumber
		Iterator itr2 = ja.iterator();
		while(itr2.hasNext()) {
			itr1=((Map)itr2.next()).entrySet().iterator();
			while(itr1.hasNext()) {
				Map.Entry pair = itr1.next();
				System.out.println(pair.getKey()+" : "+pair.getValue());
			}
		}
		
	}
}
