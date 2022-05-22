package DropDown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(rightClick).contextClick().build().perform();
		for(int i=0;i<3;i++)
		{
			act.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		//act.moveToElement(doubleClick).doubleClick().build().perform();
		//Thread.sleep(3000);
		
		driver.close();
		
	}

}
