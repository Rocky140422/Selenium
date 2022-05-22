package SeleniumSampleProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/bus-tickets/mumbai-to-bangalore?fromCityName=Mumbai&fromCityId=462&toCityName=Bangalore&toCityId=122&onward=11-May-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
		Thread.sleep(5000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,10000)");
		//j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		List<WebElement> row = driver.findElements(By.xpath("//div[@id='result-section']//div[@class='clearfix bus-item']"));
		System.out.println(row.size());
		driver.close();

	}

}
