package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(drop).click().build().perform();
		for(int i=0;i<5;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
