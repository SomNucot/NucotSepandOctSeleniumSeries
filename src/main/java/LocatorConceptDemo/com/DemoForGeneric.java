package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoForGeneric {

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
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		By uid=By.name("username");
		
		By pid=By.name("password");
		
		By lbtn=By.xpath("//button[@type='submit']");
		
		By adminClick=By.xpath("//span[text()='Admin']");
		
		//getElement(uid).sendKeys("Admin");
		
		//getElement(pid).sendKeys("admin123");
		
		//getElement(lbtn).click();
		
		
		doSendKeys(uid,"Admin");
		
		doSendKeys(pid,"admin123");
		
		doClick(lbtn);
		
		Thread.sleep(3000);
		
		doClick(adminClick);
		
		odriver.quit();
	

	}


}
