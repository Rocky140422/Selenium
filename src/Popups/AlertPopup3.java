package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		WebElement alertwithtextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertwithtextbox.click();
		Thread.sleep(1000);
		WebElement alertwithtextboxBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alertwithtextboxBtn.click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert with Textbox = "+a.getText());
		a.sendKeys("Vishwas");
		a.accept();
		//a.dismiss();
		WebElement answer = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println("Output of Clicking alert = " + answer.getText());
		Thread.sleep(2000);
		driver.close();
	}

}
