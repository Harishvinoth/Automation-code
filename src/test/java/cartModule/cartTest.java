package cartModule;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.AccountPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.MenPage;
import ObjectRepository.cartpage;

public class cartTest extends BaseClass {
	
@Test
public void CART_001() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://ecommerce.tealiumdemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	HomePage home=new HomePage(driver);
	MenPage men=new MenPage(driver);
	AccountPage account=new AccountPage(driver);
	cartpage cart=new cartpage(driver);
	LoginPage login=new LoginPage(driver);
	home.getAccountPage().click();
	account.getLogin().click();
	Login(driver);	
	Thread.sleep(1000);
	home.getMenModule().click();
	Thread.sleep(2000);
	ScrollPage(driver,100);
	men.getViewDetailsButton().click();
	men.getAddToColor().click();
	men.getAddToSize().click();
	ScrollPage(driver,100);
	men.getAddToCardButton().click();
	home.getCartButton().click();
	cart.getViewCartButton().click();
	Thread.sleep(1000);
	cart.getCheckout().click();
	cart.getBillInfo().click();
	ScrollPage(driver,400);
	cart.getShippingFree().click();
	cart.getShipping().click();
	cart.getCOD().click();
	Thread.sleep(1000);
	ScrollPage(driver,300);
	cart.getOrderPlace().click();
	driver.quit();
}

@Test(dependsOnMethods = "CART_001")
public void CART_002() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://ecommerce.tealiumdemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	HomePage home=new HomePage(driver);
	MenPage men=new MenPage(driver);
	AccountPage account=new AccountPage(driver);
	LoginPage login=new LoginPage(driver);
	home.getAccountPage().click();
	account.getLogin().click();
	Login(driver);	
	men.getAddYourReview().click();
	driver.quit();
}

}
