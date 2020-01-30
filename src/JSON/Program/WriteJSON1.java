package JSON.Program;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSON1 {
	public static void main(String[] args) throws FileNotFoundException {
		JSONObject jo = new JSONObject();// 1
		jo.put("firstName", "Krunal");
		jo.put("LastName", "Parate");
		jo.put("Age", 22);
		// for Address data first create  linkedHash Map
		Map m=new LinkedHashMap(4);
		m.put("StreetAdress", "Gandhi nagar Pune" );
		m.put("city","Nagpur");
		m.put("State","Maharashtra");
		m.put("PinCode", 441304);
		//Putting address for JSONObject
		jo.put("address", m);
		// For Phone numbers ,first create JSONArray
		JSONArray ja = new JSONArray();// 2
		
		m = new LinkedHashMap(2);
		m.put("type","Home");
		m.put("Number", "9860403086");
		//Adding map a list
		ja.add(m);
		
		m=new LinkedHashMap(2);
		m.put("type", "fax");
		m.put("Number", "9860403086");
		//Add Map to list
		ja.add(m);
		
		//putting PhoneNUmber to JSONObject
		jo.put("Phone Numbers", ja);
		
		//Write JSON to file
		PrintWriter pw =new PrintWriter("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/myJSON1");
		pw.write(jo.toJSONString());
		pw.flush();
		pw.close();
	}
}
