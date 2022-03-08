package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {


	
	public static String randomString() {
		String generateString=RandomStringUtils.randomAlphabetic(5);
		return(generateString);
	}
}
