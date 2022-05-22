package SeleniumSampleProg;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver.", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		System.out.println("google url = " + driver.getCurrentUrl());
		System.out.println("google Title = " +driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook url = "+driver.getCurrentUrl());
		System.out.println("Facebook title = "+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		org.openqa.selenium.Dimension s = new org.openqa.selenium.Dimension(200,300);
		driver.manage().window().setSize(s);
		Thread.sleep(2000);
		Point p = new Point(50,150);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.close();
	}

}
