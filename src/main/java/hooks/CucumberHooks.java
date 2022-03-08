package hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataproviders.ConfigUtility;
import factory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks  {
	
	
	public WebDriver driver;
	@Before
	public void startBrowser() {
		
		BrowserFactory factory=new BrowserFactory();
		driver=factory.startBrowser(ConfigUtility.getValue("browser"));
	}
	@AfterStep
	public void tearDown(Scenario scenario) {
		System.out.println("LOG:INFO - Running After hook - Following Scenario executed "+scenario.getName());
		if(scenario.isFailed()) {
			
			String scenario_name=scenario.getName();
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			byte[] path=ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(path, "image/png", scenario_name);
		}
	}
	@After
	public void closeBrowser() {
		driver.quit();
	}
}
