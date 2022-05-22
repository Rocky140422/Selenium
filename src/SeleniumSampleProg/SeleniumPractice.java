package SeleniumSampleProg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/signup/");
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream("C:/Users/Admin/workspace/AutomationSeleniumProg/Excel Data/Practice.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		WebElement hidden = driver.findElement(By.xpath("//div[@id='hidden_div']"));
		System.out.println(hidden.getText());
	    Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		WebElement tele = driver.findElement(By.xpath("//input[@id='tel']"));
		tele.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		WebElement fax = driver.findElement(By.xpath("//input[@id='fax']"));
		System.out.println(fax.isEnabled());
		Thread.sleep(1000);
		WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
		chooseFile.sendKeys("C:/Users/Admin/OneDrive/Desktop/FileUploadAuto.txt");
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		Select s = new Select(gender);
		s.selectByVisibleText(excel.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
	    WebElement exp = driver.findElement(By.xpath("//input[@value='two']"));
		exp.click();
		Thread.sleep(1000);
		WebElement skill1 = driver.findElement(By.xpath("//input[@value='TestingBasics']"));
		skill1.click();
		Thread.sleep(1000);
		WebElement skill2 = driver.findElement(By.xpath("//input[@value='Selenium']"));
		skill2.click();
		Thread.sleep(1000);
		WebElement skill3 = driver.findElement(By.xpath("//input[@value='Java']"));
		skill3.click();
		WebElement tool = driver.findElement(By.xpath("//select[@multiple='multiple']"));
		Select s1 = new Select(tool);
		s1.selectByVisibleText(excel.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File newDoc = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Snapnot/pract.png");
		FileUtils.copyFile(source, newDoc);
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);
		driver.close();

	}

}
