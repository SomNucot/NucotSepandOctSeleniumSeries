package NavigationDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemoApp {

	static WebDriver odriver;
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	
		By userName=By.name("username");
		By passWord=By.name("password");
		By loginButton=By.xpath("//button[@type='submit']");
		
		WebElement un=odriver.findElement(userName);
		WebElement pw=odriver.findElement(passWord);
		WebElement loginbnt=odriver.findElement(loginButton);
		
		un.sendKeys("Admin");
		pw.sendKeys("admin123");
		loginbnt.click();
		
		Thread.sleep(5000);
		
		By leave=By.xpath("//button[@title='Assign Leave']");
		WebElement leaveButton=odriver.findElement(leave);
		leaveButton.click();
		
		Thread.sleep(3000);
		

		odriver.navigate().back();		
		Thread.sleep(3000);
		
		odriver.navigate().forward();	
		Thread.sleep(3000);
		
		odriver.navigate().refresh();
		Thread.sleep(3000);
		
		
		odriver.quit();
		
		

	}

}
