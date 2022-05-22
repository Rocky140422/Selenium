package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(19, TimeUnit.SECONDS);
		//it is a wait given to check particular appplication have to load within given time 
		//mainly it is used in performance testing to check the performance of the application
		//Thread.sleep(2000);
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		
		
		driver.close();
		
	}

}
