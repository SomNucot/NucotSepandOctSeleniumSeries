package NavigationDemo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo2 {

	static WebDriver odriver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		odriver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		odriver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		odriver.navigate().back();
		Thread.sleep(3000);
		odriver.navigate().forward();
		Thread.sleep(3000);
		odriver.navigate().refresh();
		Thread.sleep(3000);

	}

}
