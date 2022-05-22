package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class combinationOfKeypadKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='ez-video-ez-stuck-close']")).click();
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("Welcome to selenium");
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("c");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		Thread.sleep(2000);
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))){
			System.out.println("Text Copied");
		}
		else
			System.out.println("Text Copied");
		Thread.sleep(5000);
		driver.close();

	}

}
