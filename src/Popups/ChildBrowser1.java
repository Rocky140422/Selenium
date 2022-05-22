package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
		
		Set<String> win = driver.getWindowHandles();
		System.out.println(win.size());
		String windows[]=new String[10];
		Iterator<String> itr = win.iterator();
		for(int i=0;i<win.size();i++){
			windows[i]=itr.next();
			System.out.println(windows[i]);
			}
		Thread.sleep(1000);
		//driver.quit();
		driver.switchTo().window(windows[0]);
		System.out.println("Tittle of window = " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(windows[1]);
		System.out.println("Tittle of window = " + driver.getTitle());
		Thread.sleep(1000);
		driver.close();

	}

}
