package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwagLabsAutomatios {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='user-name']"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@name='login-button']"));
		login.click();
		
		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Actions a = new Actions(driver);
		a.moveToElement(filter).click().build().perform();
		Thread.sleep(2000);
		for(int i=0;i<2;i++){
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		
		WebElement onesie = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
		onesie.click();
		Thread.sleep(2000);
		
		WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
		remove.click();
		Thread.sleep(2000);
		WebElement bike = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		bike.click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cart.click();
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("vishwas");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("mahajan");
		Thread.sleep(2000);
		WebElement zipcode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		zipcode.sendKeys("123456");
		Thread.sleep(2000);
		WebElement continueBtn = driver.findElement(By.xpath("//input[@name='continue']"));
		continueBtn.click();
		Thread.sleep(2000);
		WebElement finish = driver.findElement(By.xpath("//button[@name='finish']"));
		finish.click();
		Thread.sleep(2000);
		WebElement back = driver.findElement(By.xpath("//button[@name='back-to-products']"));
		back.click();
		Thread.sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menu.click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logout.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		WebElement username1 = driver.findElement(By.xpath("//input[@name='user-name']"));
		username1.sendKeys("locked_out_user");
		Thread.sleep(2000);
		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login1 = driver.findElement(By.xpath("//input[@name='login-button']"));
		login1.click();
		Thread.sleep(2000);
		
		WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		System.out.println(error.getText());
		
		driver.close();
	}

}
