package DropDown;

import java.util.List;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;


public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		//je.executeScript("arguments[0].scrollIntoView()", career);
		je.executeScript("window.scrollBy(0,1000)");
		//je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		career.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
