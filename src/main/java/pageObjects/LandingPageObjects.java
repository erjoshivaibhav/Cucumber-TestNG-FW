package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObjects {
	
	WebDriver driver;
	
public LandingPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	@FindBy(name = "uid")
	WebElement userid;
	
	@FindBy(name = "btnLogin")
	WebElement loginButton;
	
	public WebElement getUserid() {
		return userid;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getPassword() {
		return password;
	}





	@FindBy(name = "password")
	WebElement password;

}
