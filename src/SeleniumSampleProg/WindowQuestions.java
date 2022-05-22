package SeleniumSampleProg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowQuestions {

	public static void main(String[] args) {
		 System.setProperty("WebDriver.chrome.Driver", "chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://skpatro.github.io/demo/links/");
		 driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		 String WindowID = driver.getWindowHandle();
		 System.out.println(WindowID);
		 Set<String> windowIDs = driver.getWindowHandles();
		 Iterator<String> it = windowIDs.iterator();
		 String parentId = it.next();
		 String childId = it.next();
		 System.out.println("parentId" + parentId);
		 System.out.println("childId" + childId);
		 driver.switchTo().window(parentId);
		 System.out.println(driver.getTitle());
		 driver.switchTo().window(childId);
		 System.out.println(driver.getTitle());
		 for(String winId:windowIDs){
	     String tittle=driver.switchTo().window(winId).getTitle();	 
		 }
		 driver.close();
	}

}
