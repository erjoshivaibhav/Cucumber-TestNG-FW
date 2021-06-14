package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.BaseUtilities;

public class Hooks {
	private WebDriver driver;
	;
	@Before
	public void setup() {
		
		DriverFactory df=new DriverFactory();
		df.init();
		driver=DriverFactory.getDriver();
		
		
	}
	
	@AfterStep
	 public void addScreenshot(Scenario scenario){
		
		
			
	       final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	       scenario.attach(screenshot, "image/png", "image"); 
	 
	 }
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	
	
}
	


