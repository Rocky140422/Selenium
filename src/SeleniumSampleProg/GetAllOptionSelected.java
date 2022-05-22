package SeleniumSampleProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select s = new Select(monthDropDown);
		List<WebElement> allElement = s.getOptions();
		System.out.println("all month options = " + allElement.size());
		for(int i=0;i<allElement.size();i++)
		{
			System.out.println(allElement.get(i).getText());
		}
		System.out.println("***************");
		
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select s1 = new Select(dayDropDown);
		List<WebElement> allDayOptions = s1.getOptions();
		System.out.println("all day options = " + allDayOptions.size() );
		for(int i=0;i<allDayOptions.size();i++)
		{
			System.out.println(allDayOptions.get(i).getText());
		}
		System.out.println("***************");
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s2 = new Select(yearDropDown);
		List<WebElement> yearAllOptions = s2.getOptions();
		System.out.println("all year options = " + yearAllOptions.size());
		for(int i=0;i<yearAllOptions.size();i++)
		{
			System.out.println(yearAllOptions.get(i).getText());
		}
		Thread.sleep(1000);
		driver.close();
	



	}

}
