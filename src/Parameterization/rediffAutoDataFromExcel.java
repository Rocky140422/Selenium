package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


import com.sun.media.sound.InvalidFormatException;

public class rediffAutoDataFromExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(1000);
		
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement repass = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement male = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement day = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement loc = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement school = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement coll = driver.findElement(By.xpath("//input[@name='college']"));
		WebElement captha = driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		
		FileInputStream file = new FileInputStream("C:/Users/Admin/workspace/SeleniumProg/Data From Exel/Sample2.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		//log.info("opened Browser");
		fname.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Inserted Fullname from Excel Sheet");
		email.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Inserted email from Excel Sheet");
		pass.sendKeys(sheet.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Inserted password from Excel Sheet");
		repass.sendKeys(sheet.getRow(0).getCell(3).getStringCellValue());
		male.click();
		Thread.sleep(1000);
		//log.info("Clicked Male Radio button");
		Select s = new Select(day);
		s.selectByVisibleText(sheet.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Selected day mentioned in Excel Sheet");
		Select s1 = new Select(month);
		s1.selectByVisibleText(sheet.getRow(0).getCell(5).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Selected month mentioned in Excel Sheet");
		Select s2 = new Select(year);
		s2.selectByVisibleText(sheet.getRow(0).getCell(6).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Selected year mentioned in Excel Sheet");
		loc.sendKeys(sheet.getRow(0).getCell(7).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Inserted location from Excel Sheet");
		school.sendKeys(sheet.getRow(0).getCell(8).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Inserted school name from Excel Sheet");
		coll.sendKeys(sheet.getRow(0).getCell(9).getStringCellValue());
		Thread.sleep(1000);
		//log.info("Inserted college name from Excel Sheet");
		captha.sendKeys(sheet.getRow(0).getCell(10).getStringCellValue());
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Snapnot/screenshot2.png");
		FileHandler.copy(screenshot, dest);
		//log.info("Taken Screenshot of enterd Info");
		Thread.sleep(1000);
		driver.close();
	}

}
