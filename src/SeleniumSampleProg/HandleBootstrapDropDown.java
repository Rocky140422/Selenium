package SeleniumSampleProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleBootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		// Product type
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(productTypes.size());
		selectOptionFromDropdwon(productTypes, "Accounts");
		/*for(WebElement ptype:productTypes)
		{
			if(ptype.getText().equals("Accounts"))
			{
				ptype.click();
				break;
			}
		}*/
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		Thread.sleep(1000);
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		System.out.println(products.size());
		selectOptionFromDropdwon(products, "Rural Accounts");
		/*for(WebElement product:products)
		{
			if(product.getText().equals("Rural Accounts"))
			{
				System.out.println(product.getText());
				product.click();
				break;
			}
		}*/
		Thread.sleep(1000);
		driver.close();
		}
	public static void selectOptionFromDropdwon(List<WebElement> options,String value){
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
	}
}
