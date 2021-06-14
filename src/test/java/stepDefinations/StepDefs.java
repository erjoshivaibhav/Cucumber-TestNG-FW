package stepDefinations;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.HomePageObjects;
import pageObjects.LandingPageObjects;
import resources.BaseUtilities;

public class StepDefs extends BaseUtilities {
	
//	@AfterStep
//	 public void addScreenshot(Scenario scenario){
//	 
//	       final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	       scenario.attach(screenshot, "image/png", "image"); 
//	 
//	 }
	
	LandingPageObjects lp;
	HomePageObjects hp;
	//public  WebDriver driver;
	
	@Given("^Driver initilization$")
    public void driver_initilization() throws Throwable {
       System.out.println("Driver initilization");
       System.out.println("already initialized from hooks class by driver factory");
       
    }

    @When("^User opens the application$")
    public void user_opens_the_application() throws Throwable {
      System.out.println("User opens the appliction");
      String url=getTelecomUrl();
      DriverFactory.getDriver().get(url);
    }

    @When("^User logins with (.+) and (.+)$")
    public void user_logins_with_and(String username, String password) throws Throwable {
    	lp=new LandingPageObjects(DriverFactory.getDriver());
        System.out.println("User logins");
        lp.getUserid().sendKeys("mngr333302");
        lp.getPassword().sendKeys("dUhubUv");
        lp.getLoginButton().click();
        
       
        
    }

    @And("^User validate for successful login$")
    public void user_validate_for_successful_login() throws Throwable {
        System.out.println("User validates successful login");
        hp=new HomePageObjects(DriverFactory.getDriver());
        String welcomemMsg= hp.getWelcomMsg().getText();
      
        Assert.assertEquals(welcomemMsg, "Welcome To Manager's Page of GTPL Bank");
        //Assert.assertTrue(false);
    }
    
   
    
   


}

