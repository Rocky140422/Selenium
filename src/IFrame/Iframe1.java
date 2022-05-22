package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.xpath("//button[@type='button']"));
		btn.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement home = driver.findElement(By.xpath("//a[@id='tryhome']"));
		home.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
