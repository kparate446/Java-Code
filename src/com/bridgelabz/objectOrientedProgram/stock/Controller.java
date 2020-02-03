/** 
 * Created By:- Krunal Parate
 * Date :-
 */
package com.bridgelabz.objectOrientedProgram.stock;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Controller {

	StockDetails stockDetails = new StockDetails();
	static ObjectMapper mapper = new ObjectMapper();// JavaObject-JSON & Json-JavaObject                                             

	/**Read The File*/
	File file = new File("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/StockAccount.json"); // accessing json file

	public List<StockDetails> readFile() throws JsonParseException, JsonMappingException, IOException { // reading json file
		List<StockDetails> read = mapper.readValue(file, new TypeReference<List<StockDetails>>() { 
		}); 
		return read; //returning list of data
	}

	/**Write The File*/

	public void writeFile(List<StockDetails> list) throws JsonGenerationException, JsonMappingException, IOException { //writing data in json file
		mapper.defaultPrettyPrintingWriter().writeValue(file, list); 
	}

}
