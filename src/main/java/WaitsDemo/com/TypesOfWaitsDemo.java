package WaitsDemo.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesOfWaitsDemo {

	static WebDriver odriver;
	
	public static void main(String[] args) {
/*Selenium WebDriver provides three commands to implement waits in tests.

		Implicit Wait
		Explicit Wait
		Fluent Wait
		
	*/	
		
		//types of waits
				//1.Static wait
				//example -->Thread.sleep
				//Thread.sleep(9000);
				//2.Dynamic wait
				//a)implicit b)explicit and c) fluent wait
				
				//syntax--->implicit wait
				//odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinmillisceonds));
					
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		WebElement fistName=odriver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		fistName.sendKeys("nucot");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Company");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("9986453663");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Bangalore");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		odriver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("nucot@gmail.com");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		odriver.findElement(By.xpath("//label[text()='Male']")).click();
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		odriver.findElement(By.xpath("//label[text()='Tuesday']")).click();
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		odriver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000L));
		WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='RESULT_TextField-2']")));
		*/
		
		
		
		
		
		
		
		

	}

}
