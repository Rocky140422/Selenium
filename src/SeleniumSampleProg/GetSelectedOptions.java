package SeleniumSampleProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select s = new Select(monthDropDown);
		s.selectByIndex(10);
		
		List<WebElement> allEle = s.getAllSelectedOptions();
		System.out.println(allEle.get(0).getText());
		
		s.selectByIndex(11);
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		driver.close();
	}

}
