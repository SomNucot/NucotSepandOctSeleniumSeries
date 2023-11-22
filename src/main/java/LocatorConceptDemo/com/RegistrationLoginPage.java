package LocatorConceptDemo.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationLoginPage {

	static WebDriver odriver;
	
			//second type using text method
			//syntax-->//tagName[text()='value']
			//-->//label[text()='Male']
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Nucot");
		
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Company");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("9986453663");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("nucot@gmail.com");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//label[text()='Tuesday']")).click();
		Thread.sleep(2000);
		
		
	
		odriver.quit();
		

	}

}
