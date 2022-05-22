package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOperation {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[@href='/about-us']"));
		Actions a = new Actions(driver);
		a.moveToElement(aboutUs).build().perform();
		Thread.sleep(2000);
		
		for(int i=0;i<=3;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		a.click().build().perform();
	/*	WebElement careers = driver.findElement(By.xpath("//li[@class='leaf']//a[@title='American Golf Careers']"));
		careers.click();*/
		
		driver.close();
	}

}
