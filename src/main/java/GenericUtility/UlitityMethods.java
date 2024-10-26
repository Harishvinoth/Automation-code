package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.LoginPage;

public class UlitityMethods {
public static void TakesScreenShots(WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File perm= new File("./ScreenShots/"+getTime()+".png");
		
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

public static String getTime() {
	return LocalTime.now().toString().replace(":", "_").replace("-", "_");
}

public static void webElementScreenShots(WebElement element) {
	File temp=element.getScreenshotAs(OutputType.FILE);
	
	File perm= new File("./ScreenShots/"+getTime()+".png");
	
	try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	   
	
}


public void ScrollPage(WebDriver driver,int value) {
	
	Actions action=new Actions(driver);
	
	action.scrollByAmount(0, value).perform();
}

public void Login(WebDriver driver) throws InterruptedException {
	String email="rioharish055@gmail.com";
	String pass="Harish@16";
	
	LoginPage login=new LoginPage(driver);
	
	login.getEmail().sendKeys(email);
	login.getPassword().sendKeys(pass);
	ScrollPage(driver,600);
	login.getLoginbutton().click();
	
}

public void select(WebDriver driver,WebElement element,int value) {
	
	Select select=new Select(element);
	select.selectByIndex(value);
}
}
