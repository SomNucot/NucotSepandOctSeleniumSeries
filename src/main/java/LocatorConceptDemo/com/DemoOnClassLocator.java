package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOnClassLocator {

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
		odriver.findElement(By.className("login-email")).sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		//passing the password
		odriver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
		Thread.sleep(3000);
		
		//clicking on login button
		odriver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		odriver.quit();		
		
		
		
		
	}

}
