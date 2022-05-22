package DropDown;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.drievr", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		System.out.println(driver.getTitle());
		WebElement ele5000 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
		WebElement sales = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
		WebElement accDeb = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
		WebElement amtDeb = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
		WebElement accCred = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		WebElement amtCred = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
		WebElement result = driver.findElement(By.xpath("//div[@class='table4_result']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele5000).clickAndHold().moveToElement(amtDeb).release().build().perform();
		Thread.sleep(2000);
		a.moveToElement(ele5000).clickAndHold().moveToElement(amtCred).release().build().perform();
		Thread.sleep(2000);
		a.moveToElement(bank).clickAndHold().moveToElement(accDeb).release().build().perform();
		Thread.sleep(2000);
		a.moveToElement(sales).clickAndHold().moveToElement(accCred).release().build().perform();
		Thread.sleep(2000);
		String exp = "Perfect!";
		String actual = result.getText();
		Thread.sleep(2000);
		if(exp.equals(actual))
		{
			System.out.println("Drag and Drop Action Test Case Pass");
		}
		else
		{
			System.out.println("Drag and Drop Action Test Case Failed");
		}
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File newDoc = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Snapnot/DragAndDrop.png");
		org.openqa.selenium.io.FileHandler.copy(source, newDoc);
		//System.out.println(result.getText());
		driver.close();
		 
	}

}
