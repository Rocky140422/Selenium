package SeleniumSampleProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		String enterday="25";
		String enterMonth="December";
		String enterYear="1998";
		String DateType = "Prev";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		Thread.sleep(1000);
		WebElement monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String date =monthyear.getText();
		String month = date.split(" ")[0];
		String year = date.split(" ")[1];
		System.out.println(month);
		System.out.println(year);
		while(!(month.equals(enterMonth) && year.equals(enterYear)))
		{
			driver.findElement(By.xpath("//span[text()='"+DateType+"']")).click();
			monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			date =monthyear.getText();
			month = date.split(" ")[0];
			year = date.split(" ")[1];
			System.out.println(month + " " + year);
		}
		driver.findElement(By.xpath("//a[text()='"+enterday+"']")).click();
		Thread.sleep(1000);
		WebElement datePicker1 = driver.findElement(By.xpath("//input[@id='datepicker']"));
		System.out.println(datePicker1.getText());
		Thread.sleep(2000);
		driver.close();

	}

}
