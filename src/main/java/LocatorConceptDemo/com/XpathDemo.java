package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	//There are two different types of XPath:
		//Absolute XPath.-->/-->/html/body/div[1]/div[1]/div[2]/form/div[3]/div/div/div[2]/input
		//Relative XPath.--->//
		//1.Xpath=//tagname[@attribute='value']
	
		//-->//input[@id='username']
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://app.hubspot.com/login");
	
		//1.title of the page
		
		String title=odriver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		//Passing user name
		odriver.findElement(By.xpath("//input[@id='username']")).sendKeys("nucot.softwaretesting@gmail.com");
		
		Thread.sleep(3000);
		
		//passing the password
		odriver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testnucot@123");
		
		
		Thread.sleep(3000);
		
		//clicking on login button
		odriver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		Thread.sleep(3000);
		
		odriver.quit();		
		
		
		

	}

}
