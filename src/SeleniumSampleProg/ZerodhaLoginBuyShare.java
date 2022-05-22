package SeleniumSampleProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZerodhaLoginBuyShare {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		ChromeOptions a = new ChromeOptions();
		a.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		String expTittle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actTittle = driver.getTitle();
		if(expTittle.equals(actTittle)){
			System.out.println("Zerodha title is as per requirement");
		}
		else
		{
			System.out.println("Zerodha title is not as per requirement");
		}
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Kite']"));
		if(logo.isDisplayed()){
			System.out.println("Zerodha Logo Is Present on Zerodha Webpage");
		}
		else
		{
			System.out.println("Zerodha Logo Is not Present on Zerodha Webpage");
		}
		Thread.sleep(1000);
		WebElement loginToZerodhaLabel = driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
		if(loginToZerodhaLabel.isDisplayed()){
			System.out.println("Login To Zerodha Label Is Present on Zerodha Webpage");
		}
		else
		{
			System.out.println("Login To Zerodha Label Is not Present on Zerodha Webpage");
		}
		Thread.sleep(1000);
		WebElement zerodhaLabel = driver.findElement(By.xpath("//img[@alt='Zerodha']"));
		if(zerodhaLabel.isDisplayed()){
			System.out.println("Zerodha Label Is Present on Zerodha Webpage");
		}
		else
		{
			System.out.println("Zerodha Label Is not Present on Zerodha Webpage");
		}
		Thread.sleep(1000);
		
		FileInputStream file = new  FileInputStream("C:/Users/Admin/workspace/AutomationSeleniumProg/Excel Data/Zerodha test data.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebElement userIdTextbox = driver.findElement(By.xpath("//input[@id='userid']"));
		userIdTextbox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		WebElement passTaxbox = driver.findElement(By.xpath("//input[@id='password']"));
		passTaxbox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		WebElement loginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		loginBtn.click();
		Thread.sleep(1000);
		WebElement pinTextbox = driver.findElement(By.xpath("//input[@id='pin']"));
		pinTextbox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		WebElement continueBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		continueBtn.click();
		Thread.sleep(1000);
		WebElement nickname = driver.findElement(By.xpath("//span[@class='nickname']"));
		System.out.println("User Nickname = " + nickname.getText());
		Thread.sleep(1000);
		WebElement profileBtn = driver.findElement(By.xpath("//span[@class='user-id']"));
		profileBtn.click();
		WebElement usernameLabel = driver.findElement(By.xpath("//h4[@class='username']"));
		System.out.println("User Full Name : "+usernameLabel.getText());
		WebElement emaillabel = driver.findElement(By.xpath("//div[@class='email']"));
		System.out.println("User EmailId : " + emaillabel.getText());
		Thread.sleep(1000);
		WebElement startInvestingBtn = driver.findElement(By.xpath("(//button[@class='button-blue'])[1]"));
		startInvestingBtn.click();
		Thread.sleep(1000);
		WebElement searchBar = driver.findElement(By.xpath("(//input[@icon='search'])[2]"));
		searchBar.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		WebElement share = driver.findElement(By.xpath("(//span[text()='TATAMOTORS'])[2]"));
		share.click();
		Thread.sleep(1000);
		WebElement buyBtn = driver.findElement(By.xpath("//button[text()='Buy ']"));
		buyBtn.click();
		Thread.sleep(1000);
		WebElement shareQtyTextbox = driver.findElement(By.xpath("//input[@label='Qty.']"));
		shareQtyTextbox.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		WebElement priceTextBox = driver.findElement(By.xpath("//input[@label='Price']"));
		priceTextBox.clear();
		priceTextBox.sendKeys("456.15");
		Thread.sleep(1000);
		WebElement buy = driver.findElement(By.xpath("//button[@class='submit']"));
		buy.click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
