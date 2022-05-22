package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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

public class RediffAutomationDynamic {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement fname= driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]"));
		WebElement mail= driver.findElement(By.xpath("(//input[contains(@name,'login')])[1]"));
		WebElement pass= driver.findElement(By.xpath("(//input[contains(@name,'pass')])[1]"));
		WebElement repass= driver.findElement(By.xpath("(//input[contains(@name,'confirm')])[1]"));
		WebElement altemail= driver.findElement(By.xpath("(//input[contains(@name,'alt')])[1]"));
	//	WebElement checkBox= driver.findElement(By.xpath("(//input[contains(@name,'chk')])[2]"));
		WebElement mobile= driver.findElement(By.xpath("(//input[contains(@name,'mobno')])[1]"));
		WebElement day= driver.findElement(By.xpath("(//select[contains(@name,'DOB_Day')])[1]"));
		WebElement month= driver.findElement(By.xpath("(//select[contains(@name,'DOB_Month')])[1]"));
		WebElement year= driver.findElement(By.xpath("(//select[contains(@name,'DOB_Year')])[1]"));
		WebElement male= driver.findElement(By.xpath("(//input[contains(@name,'gender')])[1]"));
		WebElement country= driver.findElement(By.xpath("(//select[contains(@name,'country')])[1]"));
		WebElement city= driver.findElement(By.xpath("(//select[contains(@name,'city')])[1]"));
		WebElement captcha= driver.findElement(By.xpath("(//input[contains(@class,'captcha')])[1]"));
		
		FileInputStream file = new FileInputStream("C:/Users/Admin/workspace/SeleniumProg/Data From Exel/Sample1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		
		fname.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		mail.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		pass.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		repass.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		altemail.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		mobile.sendKeys(excel.getRow(0).getCell(5).getStringCellValue());
		Thread.sleep(1000);
		Select s = new Select(day);
		s.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
		Thread.sleep(1000);
		Select s1 = new Select(month);
		s1.selectByVisibleText(excel.getRow(0).getCell(7).getStringCellValue());
		Thread.sleep(1000);
		Select s2 = new Select(year);
		male.click();
		s2.selectByVisibleText(excel.getRow(0).getCell(8).getStringCellValue());
		Thread.sleep(1000);
		Select s3 = new Select(country);
		s3.selectByVisibleText(excel.getRow(0).getCell(9).getStringCellValue());
		Thread.sleep(1000);
		Select s4 = new Select(city);
		s4.selectByVisibleText(excel.getRow(0).getCell(10).getStringCellValue());
		Thread.sleep(1000);
		captcha.sendKeys(excel.getRow(0).getCell(11).getStringCellValue());
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File new1 = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Snapnot/dynamic.png");
		
		FileHandler.copy(source, new1);
		
		Thread.sleep(2000);
		driver.close();
	}

}
