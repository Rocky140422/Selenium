package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.sendKeys("Selenium");
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//ul//li[@class='sbct']"));
		System.out.println(elements.size());
		for(int j=0;j<elements.size();j++){
		System.out.println(elements.get(j).getText());
		}
		for(int i=0;i<elements.size();i++){
		    String exp = "seleniumhq";
			String act = elements.get(i).getText();
		if(exp.equals(act)){
			elements.get(i).click();
			break;
		}
		}
		Thread.sleep(1000);
		driver.close();
	}

}
