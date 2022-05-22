package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement chooseFileBtn = driver.findElement(By.xpath("//input[@type='file']"));
		WebElement noteTextbox = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pressBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(2000);
		chooseFileBtn.sendKeys("C:/Users/Admin/OneDrive/Desktop/Database Que.txt");
		Thread.sleep(2000);
		noteTextbox.sendKeys("Vishwas Info");
		Thread.sleep(2000);
		pressBtn.click();
		Thread.sleep(2000);
		driver.close();

	}

}
