package SeleniumPractise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotOfSectionOfWebpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Screenshot/section.png");
		FileUtils.copyFile(src, dest);*/
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src1 = logo.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Screenshot/logo.png");
		FileUtils.copyFile(src1, dest1);
		Thread.sleep(3000);
		driver.close();
		
	}

}
