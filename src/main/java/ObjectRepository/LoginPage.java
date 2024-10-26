package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h1[\"Login or Create an Account\"]")
	private WebElement loginPage;

	public WebElement getLoginPage() {
		return loginPage;
	}
	
	@FindBy(id  = "email")
	private WebElement emailforlogin;

	public WebElement getEmail() {
		return emailforlogin;
	}
	
	@FindBy(id = "pass" )
	private WebElement passwordforlogin;

	public WebElement getPassword() {
		return passwordforlogin;
	}
	
	@FindBy(linkText = "Forgot Your Password?")
	private WebElement forgotpassword;

	public WebElement getForgotpassword() {
		return forgotpassword;
	}
	
	@FindBy(xpath = "//input[@id=\"email_address\"]")
	private WebElement forgotForEmail;

	public WebElement getForgotForEmail() {
		return forgotForEmail;
	}

	@FindBy(xpath = "//div[@class=\"buttons-set\"]/button")
	private WebElement loginbutton;

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	

}
