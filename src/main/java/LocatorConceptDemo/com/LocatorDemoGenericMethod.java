package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemoGenericMethod {

	static WebDriver odriver;
	
	public static WebElement getElement(By locator)
	{
		return odriver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://www.saucedemo.com/");
		
		//4.th
		By uid=By.id("user-name");
		
		By pid=By.id("password");
		
		By lbtn=By.id("login-button");
		
		getElement(uid).sendKeys("standard_user");
		
		getElement(pid).sendKeys("secret_sauce");
		
		getElement(lbtn).click();
		
		
		doSendKeys(uid,"standard_user");
		
		doSendKeys(pid,"secret_sauce");
		
		doClick(lbtn);
		
		
		
	

	}

}
