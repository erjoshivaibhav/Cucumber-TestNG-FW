package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;

public class BaseUtilities {
	
//	public static WebDriver driver;
//	
//	public WebDriver driverInitilize() 
//	{
//		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		return driver;
//		
//	}
//	
	public String getTelecomUrl() throws IOException {
		
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\globalSettings.properties");
		 Properties p=new Properties();
		 p.load(fis);
		 
		 
		return p.getProperty("telecomurl");
	
		
	}
	
//	public void addScreenshot(Scenario scenario){
//		 
//	       final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	       scenario.attach(screenshot, "image/png", "image"); 
//	 
//	 }

}
