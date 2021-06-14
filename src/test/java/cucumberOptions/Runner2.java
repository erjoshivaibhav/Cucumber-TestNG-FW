package cucumberOptions;

//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features={ "C:\\Users\\hp\\git\\Cucumber-TestNG-FW\\src\\test\\java\\features\\Login2.feature"},
		glue="stepDefinations",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)
public class Runner2 extends AbstractTestNGCucumberTests {

}
