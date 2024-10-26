package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgotPage {
	
	public forgotPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//h1[\"Forgot Your Password?\"]")
	private WebElement forgotPage;

	public WebElement getForgotPage() {
		return forgotPage;
	}
	
	@FindBy(xpath = "//input[@id=\"email_address\"]")
	private WebElement forgotEmail;

	public WebElement getForgotEmail() {
		return forgotEmail;
	}
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement forgotSubmit;

	public WebElement getForgotSubmit() {
		return forgotSubmit;
	}
	
	

}
