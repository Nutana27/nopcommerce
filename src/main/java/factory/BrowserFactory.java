
package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	
	public WebDriver driver;
	
	static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	
	public WebDriver startBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			 tlDriver.set(driver);
		}
		return getDriver();
	}
	public static WebDriver getDriver() {
		return tlDriver.get();
	}
}
