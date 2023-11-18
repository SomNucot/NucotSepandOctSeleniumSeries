package Seleniumsessions.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDemo {

	static WebDriver odriver;
	
	public static void main(String[] args) {
		
		String browser="firefox";
		
		if(browser.equals("chrome"))
		{
			
			System.out.println("Launch chrome Browser");
			WebDriverManager.chromedriver().setup();
			 odriver=new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			 odriver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Plz pass the right browser name to luanch");
		}
		
		//2.Enter the URl
		odriver.get("https://www.amazon.com");
		
		
		
		//3.max browser window
	
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		
		
		
		
		//4.getting the title of the page
	
		String actualTitle=odriver.getTitle();
		System.out.println(actualTitle);
			
			//validation point/check point
			//Automation script/code+validations/assertions=AT
			
		if(actualTitle.equals("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("Pass");
			
		}
			else
			{
				System.out.println("Fail");
			
			}
	
		//5.getting the current url of the page
		
		String actualUrl=odriver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(actualUrl.equals("https://www.amazon.com/"))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
			
		}

	
		//6.close browser
		
		odriver.close();
		
	
	
	
	}
}
