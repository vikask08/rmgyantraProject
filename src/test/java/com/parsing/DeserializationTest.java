package com.parsing;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibrary;
/**
 * 
 * @author Dell
 *
 */
public class DeserializationTest {
	/**
	 * 
	 * @throws Throwable
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void deserialization() throws Throwable, JsonMappingException, IOException {
      ObjectMapper maper=new ObjectMapper();
      PojoLibrary pjo=maper.readValue(new File("./jsonfile.json"), PojoLibrary.class);
      
      System.out.println(pjo.name);
      System.out.println(pjo.empId);
      System.out.println(pjo.emailId);
      System.out.println(pjo.phoneNo);
      
	}
}
