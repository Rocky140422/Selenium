package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutheticationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin:admin@theinternet.herokuapp.com/basic_auth");
		//syntax
		//http://username:password@url
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		Thread.sleep(3000);
		driver.close();
	}
	}
