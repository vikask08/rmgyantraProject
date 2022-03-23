package com.parsing;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.CompanyPojo;
import com.parsing.pojo.EmployeeDetailsPojo;

public class EmployeeDetailsTest {
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		
		EmployeeDetailsPojo epojo=new EmployeeDetailsPojo("vikas", "Sdet29", 7987, "vikas@gmail.com");
		EmployeeDetailsPojo epojo2=new EmployeeDetailsPojo("Sha", "Sdet37", 6876, "sha@hmail.com");
		
		EmployeeDetailsPojo []a= {epojo,epojo2};
		CompanyPojo cpjo=new CompanyPojo("TESTYANTRA",3500, "Product",a);
		ObjectMapper maper=new ObjectMapper();
		System.out.println(maper.writeValueAsString(cpjo));
		
		maper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonarr.json"), cpjo);
	}

}
