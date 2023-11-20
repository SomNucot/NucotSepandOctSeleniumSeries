package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextDemo {

	//6-->LinkText---->only for links--->tagname--->a

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		
		

	}

}
