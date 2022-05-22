package SeleniumSampleProg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotProgram {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File newDoc = new File("C:/Users/Admin/workspace/AutomationSeleniumProg/Snapnot/snapshot2.png");
		
	
		org.openqa.selenium.io.FileHandler.copy(source, newDoc);
		


	
		
		driver.close();
	}

}
