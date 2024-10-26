package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[.=\"Create an Account\"]")
	private WebElement registerPage;

	public WebElement getRegisterPage() {
		return registerPage;
	}
	
	@FindBy(id = "firstname")
	private WebElement firstaname;

	public WebElement getFirstaname() {
		return firstaname;
	}
	
	@FindBy(id = "middlename")
	private WebElement middlename;

	public WebElement getMiddlename() {
		return middlename;
	}
	
	@FindBy(id = "lastname")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id = "email_address")
	private WebElement emailforreg;

	public WebElement getEmailforreg() {
		return emailforreg;
	}
	
	@FindBy(id = "password")
	private WebElement passwordforreg;

	public WebElement getPasswordforreg() {
		return passwordforreg;
	}

	
	@FindBy(id = "confirmation")
	private WebElement confirmpassforreg;

	public WebElement getConfirmpassforreg() {
		return confirmpassforreg;
	}
	
	@FindBy(xpath = "//a[@class=\"back-link\"]")
	private WebElement backbuttonreg;

	public WebElement getBackbuttonreg() {
		return backbuttonreg;
	}

	@FindBy(xpath = "(//span[.=\"Register\"])[2]")
	private WebElement registerbutton;

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
	
	
	
	


}
