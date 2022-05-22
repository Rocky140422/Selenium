package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//driver.switchTo().alert();
		Thread.sleep(1000);
		Set<String> win = driver.getWindowHandles();
		System.out.println("Total windows = " + win.size());
		String windows[]= new String[10];
		Iterator<String> itr = win.iterator();
		for(int i=0;i<win.size();i++){
			windows[i]=itr.next();
			System.out.println(windows[i]);
		}
		driver.switchTo().window(windows[1]);
		System.out.println("Tittle of window = " + driver.getTitle());
		driver.findElement(By.xpath("(//span[text()='Cypress'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(windows[0]);
		System.out.println("Tittle of window = " + driver.getTitle());
		driver.close();
	}

}
