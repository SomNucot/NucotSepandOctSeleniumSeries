package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssDemo {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://app.hubspot.com/login");
		
		
		
		//Passing user name
		odriver.findElement(By.cssSelector("#username")).sendKeys("nucot.softwaretesting@gmail.com");

		//passing the password
		odriver.findElement(By.cssSelector("#password")).sendKeys("Testnucot@123");
					
		Thread.sleep(3000);
		//clicking on login button
		odriver.findElement(By.cssSelector("#loginBtn")).click();

		Thread.sleep(3000);
		odriver.quit();		
		

	}

}
