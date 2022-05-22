package IFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Vishwas");
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, dest).build().perform();
		Thread.sleep(2000);
		WebElement gallery = driver.findElement(By.xpath("//ul[@id='gallery']"));
		a.dragAndDrop(ele1, gallery).build().perform();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		a.dragAndDrop(ele2, dest).build().perform();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys(" Mahajan");
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
