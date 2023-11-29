package WebElementsValidationConcepts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementValidationDemo {

	static WebDriver odriver;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
//isDisplayed()-->We are used to verify the presence of web element present in the page or not
//isEnabled()-->it used to check buttons are enabled or not-->applied for buttons
//isSelected()-->Webelement is selected or not -->checkbox,radio button,dropdown
		
		
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//1.isDisplayed()
		
		
		
		boolean usName=odriver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(usName)
		{
			System.out.println("Pass");
			System.out.println(usName);
			
		}
		else
		{
			System.out.println("fail");
		}
	
		
		
			//2.isEnabled
		
		WebElement btn=odriver.findElement(By.xpath("//button[@type='submit']"));
		boolean loginButton=btn.isEnabled();
		if(loginButton)
		{
			System.out.println("Is enabled");
			System.out.println(loginButton);
			
		}
		else
		{
			System.out.println("Not enabled");
		
		}
		odriver.quit();
		
		
		
		//3.isSelected
		
		
		
		
		
		
		
		
		

	}

}
