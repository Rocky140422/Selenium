package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class handleSliders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement left_Slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		WebElement right_Slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		Actions a = new Actions(driver);
		/*System.out.println(left_Slider.getLocation());
		System.out.println(left_Slider.getSize());*/
		a.dragAndDropBy(left_Slider, 100, 0).build().perform();
		Thread.sleep(3000);
		Action x = a.dragAndDropBy(right_Slider, -100, 0).build();
		x.perform();
		Thread.sleep(3000);
		driver.close();

	}

}
