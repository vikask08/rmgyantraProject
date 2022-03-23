package com.rmgyantra.genericUtility;

import java.util.Random;
/**
 * This class Contains Reusable Method of java.
 * @author Vikas K
 *
 */
public class JavaUtility {
	/**
	 * This method return random number
	 * @return
	 */
	public int randomNumber() {
		Random random=new Random();
		int ran = random.nextInt(5000);
		return ran;
	}
}
