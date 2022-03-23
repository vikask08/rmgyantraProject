package com.rmgyantra.genericUtility;

import io.restassured.response.Response;
/**
 * 
 * @author Vikas K
 *
 */
public class JsonUtility {
	/**
	 * 
	 * @param response
	 * @param jsonPath
	 * @return
	 */
	public Object getResponseData(Response response,String jsonPath) {
		return response.jsonPath().get(jsonPath);
	}

}
