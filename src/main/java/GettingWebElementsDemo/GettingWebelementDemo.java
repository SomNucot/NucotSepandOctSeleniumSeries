package GettingWebElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingWebelementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(3000);		
		WebElement uname=odriver.findElement(By.name("username"));
		uname.sendKeys("Admin");
		
		
		WebElement upwd=odriver.findElement(By.name("password"));
		upwd.sendKeys("admin123");
		
		
		WebElement lbtn=odriver.findElement(By.xpath("//button[@type='submit']"));
		lbtn.click();
		
		
		Thread.sleep(3000);
		
		List<WebElement> olist=odriver.findElements(By.xpath("//*"));
		
		System.out.println(olist.size());
		
	/*	
		for(int i=0;i<olist.size();i++)
		{
			String text=olist.get(i).getText();
			System.out.println(text);
			
			
		}
	*/	
		System.out.println("Using for each loop");
		
		int count=0;
		for(WebElement ele:olist)
		{
			String textValue=ele.getText();
			if(textValue.length()>0)
			{
				System.out.println(count+ ":"+textValue);
				
			}
		
			count++;
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
