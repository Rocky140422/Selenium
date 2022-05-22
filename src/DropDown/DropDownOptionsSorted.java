package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptionsSorted {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");	
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='category_id']"));
		Select s = new Select(dropDown);
		List<WebElement> options = s.getOptions();
		ArrayList orgList = new ArrayList();
		ArrayList tempList = new ArrayList();
		for(WebElement option:options){
			orgList.add(option.getText());
			tempList.add(option.getText());
		}
		System.out.println("Original List: "+orgList);
		System.out.println("Temparary List: "+tempList);
		Collections.sort(tempList);
		System.out.println("Temparary List after sorting: "+tempList);
		if(orgList.equals(tempList)){
			System.out.println("DropDown is sorted");
		}
		else{
			System.out.println("DropDown is Unsorted");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
