package RegisterModule;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.AccountPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;

public class RegisterTest extends BaseClass {
	
	@Test
	public void REG_001() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		AccountPage account=new AccountPage(driver);
		home.getAccountPage().click();
		
		account.getRegister().click();
		
		assertEquals(register.getRegisterPage().getText(), "CREATE AN ACCOUNT");
		
		TakesScreenShots(driver);
		
		driver.quit();
		
	}
	
	@Test
	public void REG_002() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		Thread.sleep(1000);
		account.getRegister().click();
		register.getFirstaname().sendKeys("harish");
		register.getMiddlename().sendKeys("G");
		register.getLastname().sendKeys("vinoth");	
		Thread.sleep(3000);
		ScrollPage(driver,600);
		register.getEmailforreg().sendKeys("rioharish.com");
		register.getPasswordforreg().sendKeys("harish16");
		register.getConfirmpassforreg().sendKeys("Harish@16");
		Thread.sleep(2000);
		ScrollPage(driver,600);
		register.getRegisterbutton().click();
		
		TakesScreenShots(driver);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void REG_003() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ecommerce.tealiumdemo.com/");
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		Thread.sleep(1000);
		account.getRegister().click();
		register.getFirstaname().sendKeys("Harish");
		register.getMiddlename().sendKeys("G");
		register.getLastname().sendKeys("vinoth");	
		Thread.sleep(1000);
		ScrollPage(driver,600);
		register.getEmailforreg().sendKeys("harishvinoth23@gmail.com");
		register.getPasswordforreg().sendKeys("Harish@16");
		register.getConfirmpassforreg().sendKeys("Harish@16");
	    Thread.sleep(2000);
		ScrollPage(driver,600);
		register.getRegisterbutton().click();
		Thread.sleep(2000);
		TakesScreenShots(driver);
		driver.quit();
		
	}
	
	
	@Test
	public void REG_004() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		account.getRegister().click();
		Thread.sleep(1000);
		register.getFirstaname().sendKeys("Harish");
		register.getMiddlename().sendKeys("G");
		register.getLastname().sendKeys("vinoth");	
		Thread.sleep(1000);
		ScrollPage(driver,600);
		register.getEmailforreg().sendKeys("harishvinoth20@gmail.com");
		register.getPasswordforreg().sendKeys("Harish@16");
		register.getConfirmpassforreg().sendKeys("Harish@16");
	    Thread.sleep(2000);
		ScrollPage(driver,600);
		register.getRegisterbutton().click();
		Thread.sleep(2000);
		TakesScreenShots(driver);
		driver.quit();
		
	}
	
	
	@Test
	public void REG_005() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		Thread.sleep(1000);
		account.getRegister().click();
		register.getFirstaname().sendKeys("");
		register.getMiddlename().sendKeys("");
		register.getLastname().sendKeys("");
		Thread.sleep(1000);
		ScrollPage(driver,600);
		register.getEmailforreg().sendKeys("");
		register.getPasswordforreg().sendKeys("");
		register.getConfirmpassforreg().sendKeys("");
	    Thread.sleep(2000);
		ScrollPage(driver,600);
		register.getRegisterbutton().click();
		Thread.sleep(2000);
		TakesScreenShots(driver);
		driver.quit();
		
	}
	
	@Test
	public void REG_006() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		AccountPage account=new AccountPage(driver);
		
		home.getAccountPage().click();
		Thread.sleep(1000);
		account.getRegister().click();
	    Thread.sleep(2000);
		ScrollPage(driver,700);
		register.getBackbuttonreg().click();
		Thread.sleep(2000);
		TakesScreenShots(driver);
		driver.quit();
		
	}
	
	@Test
	public void REG_007() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		AccountPage account=new AccountPage(driver);
		Thread.sleep(1000);
		home.getAccountPage().click();
		
		account.getRegister().click();
		Thread.sleep(1000);
		register.getFirstaname().sendKeys("Harish");
		register.getMiddlename().sendKeys("G");
		register.getLastname().sendKeys("vinoth");	
		Thread.sleep(1000);
		ScrollPage(driver,600);
		register.getEmailforreg().sendKeys("harishvinoth20@gmail.com");
		register.getPasswordforreg().sendKeys("Harish@16");
		register.getConfirmpassforreg().sendKeys("Harish@16");
		Thread.sleep(2000);
	    TakesScreenShots(driver);
	    driver.quit();
		
	}
	
	
	
	
	
	
	
	
	

}
