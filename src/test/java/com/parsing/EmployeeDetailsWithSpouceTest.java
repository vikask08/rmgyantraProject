package com.parsing;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoDetailsWithSpouce;
import com.parsing.pojo.PojoSpouceLib;

public class EmployeeDetailsWithSpouceTest {
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
    PojoSpouceLib sLib=new PojoSpouceLib("Mrs. Someone", "mrssomeone@gmail.com", 379869262);
    PojoDetailsWithSpouce detailswithwife=new PojoDetailsWithSpouce("vikas", "sdet29", "vikas@gmail.com", 986875757, sLib);
    ObjectMapper maper=new ObjectMapper();
    System.out.println(maper.writeValueAsString(detailswithwife));
    maper.writerWithDefaultPrettyPrinter().writeValue(new File("./soulemate.json"), detailswithwife);
	}
}
