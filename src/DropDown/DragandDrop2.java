package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement ele5000 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable']//a[@class='button button-orange'])[1]"));
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement sales = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
		WebElement accdeb = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
		WebElement amtdeb = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
		WebElement acccred = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		WebElement amtcred = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
		WebElement perfect = driver.findElement(By.xpath("//div[@class='table4_result']"));
	    
		Actions act = new Actions(driver);
		act.moveToElement(bank).clickAndHold().moveToElement(accdeb).release().build().perform();
		Thread.sleep(1000);
		act.moveToElement(ele5000).clickAndHold().moveToElement(amtdeb).release().build().perform();
		Thread.sleep(1000);
		act.moveToElement(sales).clickAndHold().moveToElement(acccred).release().build().perform();
		Thread.sleep(1000);
		act.moveToElement(ele5000).clickAndHold().moveToElement(amtcred).release().build().perform();
		Thread.sleep(1000);
		
		System.out.println(perfect.getText());
		String exp = "Perfect!";
		String actual = perfect.getText();
		if(exp.equals(actual)){
			System.out.println("Drag And Drop Test Case Passed");
		}
		else
		{
			System.out.println("Drag And Drop Test Case Failed");
		}
		Thread.sleep(1000);
		driver.close();

	}

}
