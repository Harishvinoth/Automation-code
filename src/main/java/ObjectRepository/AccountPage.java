package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log In")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(linkText = "Register")
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}
	
	@FindBy(linkText = "Log Out")
	private WebElement logoutbutton;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
}
