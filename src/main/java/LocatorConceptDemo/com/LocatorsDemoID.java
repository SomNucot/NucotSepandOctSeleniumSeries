package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemoID {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://www.saucedemo.com/");
	
		//1.title of the page
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		//Passing user name
		odriver.findElement(By.id("user-name")).sendKeys("standard_user");
		
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
