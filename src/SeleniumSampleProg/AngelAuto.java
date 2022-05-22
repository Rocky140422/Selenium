package SeleniumSampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngelAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		Thread.sleep(2000);
		WebElement userId = driver.findElement(By.xpath("//input[@id='txtUserID']"));
		userId.sendKeys("V267462");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='txtTradingPassword']"));
		password.sendKeys("Vishwas@1234");
		Thread.sleep(2000);
		WebElement signInBtn = driver.findElement(By.xpath("//a[@id='loginBtn']"));
		signInBtn.click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//a[@class='searchA search_btn']"));
		search.click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
