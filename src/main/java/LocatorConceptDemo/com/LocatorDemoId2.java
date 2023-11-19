package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemoId2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://www.tesco.com/");
	
		//1.title of the page
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		//pass value into search input text
		
		odriver.findElement(By.id("beans-masthead-desktop-search-input")).sendKeys("iphone 15 pro max");
		Thread.sleep(3000);
		
		
		odriver.quit();		

	}

}
