package SeleniumSampleProg;

import java.io.File;
import java.io.FileInputStream;
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

public class GoogleAutomation {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com&hl=en&dsh=S1627527252%3A1646629586418556&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(1000);
		
		FileInputStream f = new FileInputStream("C:/Users/Admin/workspace/SeleniumProg/Data From Exel/Sample2.xlsx");
		Sheet excel = WorkbookFactory.create(f).getSheet("Sheet2");
		
		
		
		
		
		WebElement fnameTextBox = driver.findElement(By.xpath("//input[@name='firstName']"));
		fnameTextBox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
        System.out.println("fnameTextBox element is available on webapp = "+fnameTextBox.isDisplayed());
		Thread.sleep(1000);
		
		WebElement lastNameTxtBox = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastNameTxtBox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		System.out.println("lastNameTxtBox element is available on webapp = "+lastNameTxtBox.isDisplayed());
		Thread.sleep(1000);
		
		WebElement userNameTextBox = driver.findElement(By.xpath("//input[@name='Username']"));
		userNameTextBox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		System.out.println("userNameTextBox element is available on webapp = "+userNameTextBox.isDisplayed());
		Thread.sleep(1000);
		
		WebElement passTextBox = driver.findElement(By.xpath("//input[@name='Passwd']"));
		System.out.println("passTextBox element is available on webapp = "+passTextBox.isDisplayed());
		passTextBox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		
		WebElement confirmPasTextBox = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		System.out.println("confirmPasTextBox element is available on webapp = "+confirmPasTextBox.isDisplayed());
		confirmPasTextBox.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		
		WebElement showPassCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		showPassCheckBox.click();
		System.out.println("showPassCheckBox element is available on webapp = "+showPassCheckBox.isDisplayed());
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File newDoc = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Snapnot/snapshot1.png"); 
		
		FileHandler.copy(source, newDoc);
		driver.close();
	}

}
