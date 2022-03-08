package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		  features=".//FeatureFile",
		  glue={"stepDefinitions","hooks"},
		  dryRun=false,
		  monochrome=true,
		 // tags= {"@Login"},
		  plugin= "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		)


public class TestRun {

}
