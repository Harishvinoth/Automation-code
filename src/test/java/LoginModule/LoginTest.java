package LoginModule;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.AccountPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.forgotPage;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	public void LOGIN_001() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		assertEquals(login.getLoginPage().getText(), "LOGIN OR CREATE AN ACCOUNT");
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void LOGIN_002() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		login.getEmail().sendKeys("harishgamil.com");
		login.getPassword().sendKeys("harish16");
		ScrollPage(driver,600);
		login.getLoginbutton().click();
	    Thread.sleep(1000);
	    home.getAccountPage();
	    account.getLogoutbutton();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void LOGIN_003() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		login.getEmail().sendKeys("rioharish055@gmail.com");
		login.getPassword().sendKeys("Harish@16");
		ScrollPage(driver,600);
		login.getLoginbutton().click();
	    Thread.sleep(1000);
	    home.getAccountPage();
	    account.getLogoutbutton();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	
	
	
	@Test
	public void LOGIN_004() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		login.getEmail().sendKeys("harishrio055@gmail.com");
		login.getPassword().sendKeys("Harish@16");
		ScrollPage(driver,600);
		login.getLoginbutton().click();
	    Thread.sleep(1000);
	    home.getAccountPage();
	    account.getLogoutbutton();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void LOGIN_005() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		login.getEmail().sendKeys("");
		login.getPassword().sendKeys("");
		ScrollPage(driver,600);
		login.getLoginbutton().click();
	    Thread.sleep(1000);
	    home.getAccountPage();
	    account.getLogoutbutton();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void LOGIN_006() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		login.getEmail().sendKeys("rioharish055@gmail.com");
		login.getPassword().sendKeys("Harish@16");
	    Thread.sleep(1000);
	    home.getAccountPage();
	    account.getLogoutbutton();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void LOGIN_007() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		login.getEmail().sendKeys("harishrio055@gmail.com");
		login.getPassword().sendKeys("Harish@16");
		ScrollPage(driver,600);
		login.getLoginbutton().click();
	    Thread.sleep(1000);
	    home.getAccountPage();
	    account.getLogoutbutton();
		TakesScreenShots(driver);
		driver.quit();
	}
	
	@Test
	public void LOGIN_008() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		forgotPage forgot=new forgotPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		
		ScrollPage(driver,600);
		login.getForgotpassword().click();
		forgot.getForgotEmail().sendKeys("rioharish055@gmail.com");
		forgot.getForgotSubmit().click();
		driver.quit();
	  
		
	}
	
	@Test
	public void LOGIN_009() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getLogin().click();
		login.getEmail().sendKeys("rioharish055@gmail.com");
		login.getPassword().sendKeys("Harish@16");
		ScrollPage(driver,600);
		login.getLoginbutton().click();
		home.getAccountPage().click();
		account.getLogoutbutton().click();
		driver.quit();
		
		
		
	}
	
	

}
