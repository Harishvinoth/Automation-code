package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	public cartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "VIEW SHOPPING CART")
	private WebElement viewCartButton;

	public WebElement getViewCartButton() {
		return viewCartButton;
	}
	
    @FindBy(xpath = "(//span[.=\"Proceed to Checkout\"])[1]")
    private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
    
    @FindBy(xpath = "(//button[@class=\"button\"])[1]")
    private WebElement billInfo;

	public WebElement getBillInfo() {
		return billInfo;
	}
    
    @FindBy(xpath = "//input[@id=\"s_method_freeshipping_freeshipping\"]")
    private WebElement shippingFree;

	public WebElement getShippingFree() {
		return shippingFree;
	}
    
    @FindBy(xpath = "(//button[@class=\"button\"])[2]")
    private WebElement shipping;

	public WebElement getShipping() {
		return shipping;
	}
    
    @FindBy(xpath ="//button[@onclick=\"payment.save()\"]")
    private WebElement COD;

	public WebElement getCOD() {
		return COD;
	}
    
    @FindBy(xpath = "//button[@title=\"Place Order\"]")
    private WebElement orderPlace;

	public WebElement getOrderPlace() {
		return orderPlace;
	}
    
    
    

}
