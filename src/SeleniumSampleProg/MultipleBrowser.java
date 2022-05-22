package SeleniumSampleProg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;


public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		String browser ="edge";
		if(browser=="chrome"){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.close();
		}
		else if(browser=="gecko"){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			driver.close();
		}
		else if(browser=="edge"){
			System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			driver.close();
		}
		else if(browser=="opera"){
			System.setProperty("webdriver.opera.driver", "operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			driver.close();
		}
		
	}

}
