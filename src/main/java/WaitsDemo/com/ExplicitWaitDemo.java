package WaitsDemo.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {

	static WebDriver odriver;
	
	public static void main(String[] args) throws InterruptedException {
		//syntax--->explicit wait
		
	/*	
		WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='RESULT_TextField-2']")));
				
	*/		
		
		
	/*	In order to declare explicit wait, one has to use ExpectedConditions. The following Expected Conditions can be used in Explicit Wait.

		alertIsPresent()
		elementSelectionStateToBe()
		elementToBeClickable()
		elementToBeSelected()
		frameToBeAvaliableAndSwitchToIt()
		invisibilityOfTheElementLocated()
		invisibilityOfElementWithText()
		presenceOfAllElementsLocatedBy()
		presenceOfElementLocated()
		textToBePresentInElement()
		textToBePresentInElementLocated()
		textToBePresentInElementValue()
		titleIs()
		titleContains()
		visibilityOf()
		visibilityOfAllElements()
		visibilityOfAllElementsLocatedBy()
		visibilityOfElementLocated()
		
		
		*/
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://login.salesforce.com/?locale=in");
		
		
		//Explicitwait
		WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		odriver.findElement(By.id("username")).sendKeys("Nucot");
		
		WebDriverWait wait1=new WebDriverWait(odriver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		
		odriver .findElement(By.xpath("//input[@id='password']")).sendKeys("nucot!111");
		
		WebDriverWait wait2=new WebDriverWait(odriver,Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Login']")));
		
		
		odriver.quit();
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
