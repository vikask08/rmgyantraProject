package com.parsing;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import com.parsing.pojo.PojoLibrary;
/**
 * 
 * @author VikasK
 *
 */
public class EmployeeLibraryTest {
	/**
	 * 
	 * @throws Throwable
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void serialization() throws Throwable, JsonMappingException, IOException {
		
		//we are creating an object of pojo library
		PojoLibrary pLib =new PojoLibrary("Vikas","SDET29","zvikas.8294@gmail.com",971137135);
		
		//converting java object in to json
		ObjectMapper mapper=new ObjectMapper();
		
		//printing the json object in to the console
		System.out.println(mapper.writeValueAsString(pLib));
		
		//generating a json file
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonfile.json"), pLib);
	}
}
