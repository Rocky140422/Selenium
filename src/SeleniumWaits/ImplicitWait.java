package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//li[@role='presentation'])[3]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("(//li[@role='presentation'])[4]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
