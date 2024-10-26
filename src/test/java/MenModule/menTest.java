package MenModule;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.AccountPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.MenPage;
import ObjectRepository.cartpage;

public class menTest extends BaseClass {
	
	@Test
	public void MEN_001() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		Thread.sleep(1000);
		assertEquals(men.getMenPage().getText(),"MEN");
		home.getAccountPage();
		account.getLogoutbutton().click();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void MEN_002() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		select(driver,men.getSortBy(),1);
		men.getViewAs().click();
		select(driver,men.getViewAs(),1);
		men.getPageNext().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		driver.quit();
	}
	
	@Test
	public void MEN_003() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		men.getSorybyprice().click();
		Thread.sleep(2000);
		ScrollPage(driver,400);
		men.getSortbycolor().click();
		Thread.sleep(2000);
		ScrollPage(driver,400);
		men.getSortbystyle().click();
		Thread.sleep(2000);
		ScrollPage(driver,400);
		men.getSortbytype().click();
		Thread.sleep(2000);
		ScrollPage(driver,400);
		men.getSortbysleeve().click();
		Thread.sleep(2000);
		ScrollPage(driver,400);
		men.getSortbyfit().click();
		Thread.sleep(2000);
		ScrollPage(driver,400);
		men.getSortbysize().click();
		Thread.sleep(2000);
		ScrollPage(driver,400);
		men.getSortbygender().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		driver.quit();
	}
	
	@Test
	public void MEN_004() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		Thread.sleep(2000);
		ScrollPage(driver,100);
		men.getViewDetailsButton().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void MEN_005() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		Thread.sleep(2000);
		ScrollPage(driver,100);
		men.getViewDetailsButton().click();
		men.getAddToColor().click();
		men.getAddToSize().click();
		ScrollPage(driver,100);
		men.getAddToCardButton().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void MEN_006() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		Thread.sleep(2000);
		ScrollPage(driver,200);
		men.getAddToWish().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void MEN_007() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		Thread.sleep(2000);
		ScrollPage(driver,250);
		men.getAddToCampare().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	
	@Test
	public void MEN_008() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		Thread.sleep(2000);
		ScrollPage(driver,100);
		men.getViewDetailsButton().click();
		men.getSeeReview().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		TakesScreenShots(driver);	
		driver.quit();
	}

	@Test
	public void MEN_009() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		Thread.sleep(2000);
		ScrollPage(driver,100);
		men.getViewDetailsButton().click();
		men.getAddYourReview().click();
		men.getQualityStar().click();
		men.getValueStar().click();
		men.getPriceStar().click();
		ScrollPage(driver,200);
		men.getTextArea().sendKeys("its good");
		men.getSummary().sendKeys("good");
		men.getNickname().sendKeys("harish");
		men.getSubmit().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		TakesScreenShots(driver);	
		driver.quit();
	}
	
	@Test
	public void MEN_010() throws InterruptedException {
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
		Thread.sleep(1000);
		home.getMenModule().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		webElementScreenShots(men.getProductimage());
		driver.quit();
	}
	
	
	
	@Test
	public void MEN_011() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		MenPage men=new MenPage(driver);
		cartpage cart=new cartpage(driver);
		AccountPage account=new AccountPage(driver);
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
		men.getRemoveAddToCard().click();
		home.getAccountPage();
		account.getLogoutbutton().click();
		driver.quit();
			
	}
	

}
