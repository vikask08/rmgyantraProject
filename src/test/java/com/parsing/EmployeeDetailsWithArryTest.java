package com.parsing;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoArryLibrary;

public class EmployeeDetailsWithArryTest {
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		long[] arry= {987654321,897794769,287492748};
		PojoArryLibrary pLib = new PojoArryLibrary("Vikas", "Sdet29", "vikas@gmail.com", arry);
		ObjectMapper mapper=new ObjectMapper();
		System.out.println(mapper.writeValueAsString(pLib));
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonArryfile.json"), pLib);
		}
	}
