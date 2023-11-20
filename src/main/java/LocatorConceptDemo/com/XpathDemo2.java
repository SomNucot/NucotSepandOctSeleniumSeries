package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo2 {

		//1.Xpath=//tagname[@attribute='value']
	
			//-->//input[@id='username']
	
			//-->//*[@id='username']
	
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://app.hubspot.com/login");
		
		
		
		//Passing user name
		odriver.findElement(By.xpath("//input[@id='username']")).sendKeys("nucot.softwaretesting@gmail.com");

		//passing the password
		odriver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testnucot@123");
					
		//clicking on login button
		odriver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		odriver.quit();		
		
		
		
		
		
		
		
		
	}

}
