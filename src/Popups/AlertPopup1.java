package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		ok.click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		System.out.println("Alert with ok = "+a.getText());
		a.accept();
		Thread.sleep(3000);
		WebElement okandcancel = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		okandcancel.click();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		
		Thread.sleep(2000);
		driver.close();
	}

}
