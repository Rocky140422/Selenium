package DropDown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RailyatriAutomation {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		FileInputStream file = new FileInputStream("C:/Users/Admin/workspace/AutomationSeleniumProg/Excel Data/Railyatri.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username-id']"));
		userName.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='usr_pwd']"));
		pass.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		WebElement repass = driver.findElement(By.xpath("//input[@id='cnfm_pass']"));
		repass.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		WebElement mobNo = driver.findElement(By.xpath("//input[@id='user-number']"));
		mobNo.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email_id']"));
		email.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(drop).click().build().perform();
		for(int i=0;i<6;i++){
			a.sendKeys(Keys.DOWN).build().perform();
		//	a.sendKeys(Keys.DOWN).build().perform();
		    Thread.sleep(1000);
		}
		
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		WebElement secAns = driver.findElement(By.xpath("//input[@id='sec_ans_field']"));
		secAns.sendKeys(excel.getRow(0).getCell(5).getStringCellValue());
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File newDoc = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Snapnot/Action.png");
		FileUtils.copyFile(source, newDoc);
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
