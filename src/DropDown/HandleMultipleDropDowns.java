package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDowns {
	public static WebDriver driver;
	public static void selectoptionfromdropdown(WebElement ele,String value){
		Select drp = new Select(ele);
		List<WebElement> allOptions = drp.getOptions();
		for(WebElement option:allOptions){
			if((option.getText()).equals(value))
			{
				option.click();
				break;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		selectoptionfromdropdown(dayDropDown,"25");
		Thread.sleep(1000);
		selectoptionfromdropdown(monthDropDown,"DEC");
		Thread.sleep(1000);
		selectoptionfromdropdown(yearDropDown,"2021");
		Thread.sleep(1000);
		driver.close();
	}
}
