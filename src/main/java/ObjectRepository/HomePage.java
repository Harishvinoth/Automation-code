package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "(//span[.=\"Account\"])[1]")
	private WebElement AccountPage;

	public WebElement getAccountPage() {
		return AccountPage;
	}
	
	@FindBy(linkText = "MEN")
	private WebElement menModule;

	public WebElement getMenModule() {
		return menModule;
	}
	
	@FindBy(xpath = "//span[.=\"Cart\"]")
	private WebElement cartButton;

	public WebElement getCartButton() {
		return cartButton;
	}
	
	

}
