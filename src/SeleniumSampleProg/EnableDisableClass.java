package SeleniumSampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableClass {

	
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
				Thread.sleep(1000);
				WebElement disableBtn = driver.findElement(By.xpath("//button[@id='disable']"));
				
				System.out.println("disable button is displayed = " + disableBtn.isDisplayed());
				System.out.println("disable button is enabled = " + disableBtn.isEnabled());
				System.out.println("disable button is selected = " + disableBtn.isSelected());
				System.out.println("**************************");
				
				WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enable-button']"));
				
				System.out.println("enableBtn button is displayed = " + enableBtn.isDisplayed());
				System.out.println("enableBtn button is enabled = " + enableBtn.isEnabled());
				System.out.println("enableBtn button is selected = " + enableBtn.isSelected());
				System.out.println("**************************");
				WebElement checkbox = driver.findElement(By.xpath("//input[@id='ch']"));
				System.out.println("checkbox before clicked = " + checkbox.isSelected());
				checkbox.click();
				Thread.sleep(2000);
				System.out.println("checkbox after clicked = " + checkbox.isSelected());
				
				
				
				driver.close();
			}

		

	}


