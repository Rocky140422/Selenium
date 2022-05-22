package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlert {

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
		Thread.sleep(1000);
		a.accept();
		Thread.sleep(2000);
		WebElement okandcancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		okandcancel.click();
		Thread.sleep(1000);
		WebElement okandcancelBtn = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		okandcancelBtn.click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert with Ok and Cancel = "+a1.getText());
		//a1.accept();
		a1.dismiss();
		WebElement answer = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println("Output of Clicking alert = " + answer.getText());
		Thread.sleep(2000);
		WebElement alertwithtextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertwithtextbox.click();
		Thread.sleep(1000);
		WebElement alertwithtextboxBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alertwithtextboxBtn.click();
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert with Textbox = "+a2.getText());
		a2.sendKeys("Vishwas");
		a2.accept();
		//a2.dismiss();
		WebElement answer1 = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println("Output of Clicking alert = " + answer1.getText());
		Thread.sleep(2000);
		driver.close();

	}

}
