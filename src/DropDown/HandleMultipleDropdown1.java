package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdown1 {
	public static WebDriver driver;
	public static void selectoptionfromdropdown(String xpath,String valueToBeSelected){
		WebElement dayDropDown = driver.findElement(By.xpath(xpath));
		
		List<WebElement> allOptions = dayDropDown.findElements(By.tagName("option"));
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
			if(option.getText().equals("25"))
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
		selectoptionfromdropdown("//select[@name='date_day']", "25");
		Thread.sleep(2000);
		driver.close();
	}
}
