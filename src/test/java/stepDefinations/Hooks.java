package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import resources.BaseUtilities;

public class Hooks {
	
	
	@AfterStep
	 public void addScreenshot(Scenario scenario){
		
		
			
	       final byte[] screenshot = ((TakesScreenshot) BaseUtilities.driver).getScreenshotAs(OutputType.BYTES);
	       scenario.attach(screenshot, "image/png", "image"); 
	 
	 }

}
