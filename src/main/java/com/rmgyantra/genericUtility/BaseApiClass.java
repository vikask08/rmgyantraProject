package com.rmgyantra.genericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseApiClass {
	public DatabaseUtility dUtil=new DatabaseUtility();
	public JavaUtility jUtil=new JavaUtility();
	@BeforeSuite
	public void bsConfiguration() {
		dUtil.getConnectionOfDb();
		System.out.println("Database connection started");
		baseURI="http://localhost";
		port=8084;
		System.out.println("Database connection established");
	}
    @AfterSuite
    public void aSConfiguration() {
    	dUtil.closeDB();
    	System.out.println("database connection close");
    }
}
