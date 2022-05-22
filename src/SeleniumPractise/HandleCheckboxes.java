package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("no. of checkboxes: " + checkBoxes.size());
		// select all checkboxes present
		/*for(int i=0;i<checkBoxes.size();i++){
			checkBoxes.get(i).click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.close();*/
		// select random checkboxes
		/*for(WebElement chbox:checkBoxes){
			String chboxName = chbox.getAttribute("id");
			if(chboxName.equals("wednesday") || chboxName.equals("friday")){
				chbox.click();
				Thread.sleep(1000);
			}
		}*/
		int totalchboxes = checkBoxes.size();
		//select last 3 chechboxes
		/*for(int i=totalchboxes-3;i<totalchboxes;i++){
			checkBoxes.get(i).click();
		}*/
		//select first two checkboxes
		for(int i=0;i<totalchboxes;i++){
			if(i<2){
			checkBoxes.get(i).click();
			}
		}
		
	}

}
