package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//span[@dir='auto'])[2]")).click();
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript("arguments[0].scrollIntoView()", downloadLink1);
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		WebElement downloadLink1 = driver.findElement(By.xpath("(//a[text()='Download sample DOC file'])[1]"));
		Thread.sleep(5000);
		downloadLink1.click();
	
	}

}
