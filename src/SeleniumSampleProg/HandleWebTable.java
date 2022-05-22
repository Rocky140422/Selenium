package SeleniumSampleProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Show More >>']")).click();
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='dataTable']//tr"));
		System.out.println("No. of Rows " + row.size());
		
		for(int i=0;i<row.size();i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		
		
		
		driver.close();

	}

}
