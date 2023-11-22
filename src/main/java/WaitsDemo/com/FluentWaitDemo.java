package WaitsDemo.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	static WebDriver odriver;
	
	
	public static void main(String[] args) {
		//3.FluentWait
		//syntax
				/*
				 Wait<WebDriver> owait=new FluentWait<WebDriver>(odriver)
						.withTimeout(Duration.ofSeconds(Time in Milliseconds))
						.pollingEvery(Duration.ofSeconds(Time in Milliseconds))
						.igoring(Exception.class);
				*/
				
		
	/*	
		//Declare and initialise a fluent wait
		FluentWait wait = new FluentWait(driver);
		//Specify the timout of the wait
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		//Sepcify polling time
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class)

		//This is how we specify the condition to wait on.
		//This is what we will explore more in this chapter
		wait.until(ExpectedConditions.alertIsPresent());
		
		
	*/	
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://login.salesforce.com/?locale=in");
		
		Wait<WebDriver> owait=new FluentWait<WebDriver>(odriver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
			
		
		
		
		

	}

}
