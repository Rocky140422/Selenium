package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartmouseOver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
//			To	see	the	xpath	=>	Need	to	press	ctrl	+	Shift	+	c
		WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions	a	=	new	Actions(driver);
		a.moveToElement(loginLink).build().perform();
		Thread.sleep(3000);
		WebElement	giftCardLink = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		giftCardLink.click();
		Thread.sleep(3000);
	}

}
