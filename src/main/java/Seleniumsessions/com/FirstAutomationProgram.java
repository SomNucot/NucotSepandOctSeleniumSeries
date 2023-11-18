package Seleniumsessions.com;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationProgram {

	public static void main(String[] args) {
		
		//1.Step
		//Opening the browser using the script
		//1.To launch the browser
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		
		//2.Enter the URl
		odriver.get("https://www.amazon.com");
		
		//3.getting the title of the page
		
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
		
		//4.getting the current url of the page
		
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
		
		

		
		//5.close browser
		
		odriver.quit();
		
				
				
						
		
		
		
		

	}

}
