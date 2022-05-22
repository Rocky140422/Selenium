package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
	    System.out.println(elements.size());
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			String exp = "Gmail";
			String act = elements.get(i).getText();
			if(exp.equals(act)){
				elements.get(i).click();
				break;
			}
			
		}
		
		driver.close();
	}

}
