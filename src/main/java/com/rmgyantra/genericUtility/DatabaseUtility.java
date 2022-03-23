package com.rmgyantra.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
/**
 * This class Contains Database Utility methods
 * @author Viaks K
 *
 */
public class DatabaseUtility {
	/**
	 * This method will connect mysql database to java technology
	 * @param query
	 */
	Connection connection=null;
	ResultSet result = null;
	public void getConnectionOfDb() {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	/**
	 * This method will close the database.
	 */
	public void closeDB() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This method will Verify and fetchData from database
	 * @param query
	 * @param colmnNumber
	 * @param expectedData
	 * @return
	 * @throws Throwable
	 */
	public String getTheDataAndVerifyData(String query,int colmnNumber,String expectedData) throws Throwable {
		ResultSet result = connection.createStatement().executeQuery(query);
		boolean flag=false;
		String actualData=null;
		while(result.next()) {
			try {
				if(result.getString(colmnNumber).equals(expectedData)) {
					System.out.println(result.getString(colmnNumber));
					flag=true;
					actualData=result.getString(colmnNumber);
					break;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (flag) {
			System.out.println("Data is verified from database");
			return actualData;
		}
		else {
			System.out.println("Data is Not found");
			return actualData;
		}
	}
	/**
	 * 
	 * @param query
	 * @return
	 */
	public ResultSet getAllData(String query) {
		try {
			result=connection.createStatement().executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
