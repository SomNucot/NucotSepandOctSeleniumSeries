package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorWithDiffApporaches {

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
		//1.first way
		//odriver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//2.Second way
		
		WebElement userNameId=odriver.findElement(By.id("user-name"));
		userNameId.sendKeys("standard_user");
		
		//3.third way
		
		By uid=By.id("user-name");
		WebElement userNameId1=odriver.findElement(uid);
		userNameId1.sendKeys("standard_user");
		
		
		
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
