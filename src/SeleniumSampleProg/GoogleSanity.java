package SeleniumSampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSanity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com&hl=en&dsh=S1627527252%3A1646629586418556&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");

		WebElement createaccLabel = driver.findElement(By.xpath("//span[text()='Create your Google Account']"));
		WebElement toContinueLabel = driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		WebElement fnameLabel = driver.findElement(By.xpath("//div[text()='First name']"));
		WebElement fnameTextBox = driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement lastnameTextBox = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement lastnameLabel = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='Username']"));
		WebElement usernameLabel = driver.findElement(By.xpath("//div[text()='Username']"));
		WebElement GmailLabel = driver.findElement(By.xpath("//span[text()='@gmail.com']"));
		WebElement youcanUseLabel = driver.findElement(By.xpath("//div[text()='You can use letters, numbers & periods']"));
		WebElement passTextBox = driver.findElement(By.xpath("//input[@name='Passwd']"));
		WebElement passwordlabel = driver.findElement(By.xpath("//div[text()='Password']"));
		WebElement confirmPasTextBox = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		WebElement confrmLabel = driver.findElement(By.xpath("//div[text()='Confirm']"));
		WebElement use8ormoreLabel = driver.findElement(By.xpath("//span[text()='Use 8 or more characters with a mix of letters, numbers & symbols']"));
		WebElement showPassCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement showPassLabel = driver.findElement(By.xpath("//div[text()='Show password']"));
		WebElement signininsteadlabel = driver.findElement(By.xpath("//span[text()='Sign in instead']"));
		WebElement nextBtn = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
		WebElement nextlabel = driver.findElement(By.xpath("//span[text()='Next']"));
		WebElement bigLogo = driver.findElement(By.xpath("//img[@class='j9NuTc TrZEUc']"));
		WebElement oneAcclabel = driver.findElement(By.xpath("//figcaption[text()='One account. All of Google working for you.']"));
		WebElement helpLAbel = driver.findElement(By.xpath("//a[text()='Help']"));
		WebElement privacyLabel = driver.findElement(By.xpath("//a[text()='Privacy']"));
		WebElement termsLabel = driver.findElement(By.xpath("//a[text()='Terms']"));
		
		int count = 0;
		
		if(createaccLabel.isDisplayed())
		{
			System.out.println("createaccLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("createaccLabel element is not available on web app");
		}
		
		if(toContinueLabel.isDisplayed())
		{
			System.out.println("toContinueLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("toContinueLabel element is not available on web app");
		}
		
		if(fnameLabel.isDisplayed())
		{
			System.out.println("fnameLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("fnameLabel element is not available on web app");
		}
		
		if(fnameTextBox.isDisplayed())
		{
			System.out.println("fnameTextBox element is available on web app");
			count++;
		}
		else
		{
			System.out.println("fnameTextBox element is not available on web app");
		}
		
		
		
		if(lastnameTextBox.isDisplayed())
		{
			System.out.println("lastnameTextBox element is available on web app");
			count++;
		}
		else
		{
			System.out.println("lastnameTextBox element is not available on web app");
		}
		
		if(lastnameLabel.isDisplayed())
		{
			System.out.println("lastnameLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("lastnameLabel element is not available on web app");
		}
		
		if(usernameTextBox.isDisplayed())
		{
			System.out.println("usernameTextBox element is available on web app");
			count++;
		}
		else
		{
			System.out.println("usernameTextBox element is not available on web app");
		}
		
		if(usernameLabel.isDisplayed())
		{
			System.out.println("usernameLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("usernameLabel element is not available on web app");
		}
		
		if(GmailLabel.isDisplayed())
		{
			System.out.println("GmailLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("GmailLabel element is not available on web app");
		}
		
		if(youcanUseLabel.isDisplayed())
		{
			System.out.println("youcanUseLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("youcanUseLabel element is not available on web app");
		}
		
		if(passTextBox.isDisplayed())
		{
			System.out.println("passTextBox element is available on web app");
			count++;
		}
		else
		{
			System.out.println("passTextBox element is not available on web app");
		}
		
		if(passwordlabel.isDisplayed())
		{
			System.out.println("passwordlabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("passwordlabel element is not available on web app");
		}
		
		if(confirmPasTextBox.isDisplayed())
		{
			System.out.println("confirmPasTextBox element is available on web app");
			count++;
		}
		else
		{
			System.out.println("confirmPasTextBox element is not available on web app");
		}
		
		if(confrmLabel.isDisplayed())
		{
			System.out.println("confrmLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("confrmLabel element is not available on web app");
		}
		
		if(use8ormoreLabel.isDisplayed())
		{
			System.out.println("use8ormoreLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("use8ormoreLabel element is not available on web app");
		}
		
		if(showPassCheckBox.isDisplayed())
		{
			System.out.println("showPassCheckBox element is available on web app");
			count++;
		}
		else
		{
			System.out.println("showPassCheckBox element is not available on web app");
		}
		
		if(showPassLabel.isDisplayed())
		{
			System.out.println("showPassLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("showPassLabel element is not available on web app");
		}
		
		if(signininsteadlabel.isDisplayed())
		{
			System.out.println("signininsteadlabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("signininsteadlabel element is not available on web app");
		}
		
		if(nextBtn.isDisplayed())
		{
			System.out.println("nextBtn element is available on web app");
			count++;
		}
		else
		{
			System.out.println("nextBtn element is not available on web app");
		}
		
		if(nextlabel.isDisplayed())
		{
			System.out.println("nextlabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("nextlabel element is not available on web app");
		}
		
		if(bigLogo.isDisplayed())
		{
			System.out.println("bigLogo element is available on web app");
			count++;
		}
		else
		{
			System.out.println("bigLogo element is not available on web app");
		}
		
		if(oneAcclabel.isDisplayed())
		{
			System.out.println("oneAcclabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("oneAcclabel element is not available on web app");
		}
		
		if(helpLAbel.isDisplayed())
		{
			System.out.println("helpLAbel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("helpLAbel element is not available on web app");
		}
		
		if(privacyLabel.isDisplayed())
		{
			System.out.println("privacyLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("privacyLabel element is not available on web app");
		}
		
		if(termsLabel.isDisplayed())
		{
			System.out.println("termsLabel element is available on web app");
			count++;
		}
		else
		{
			System.out.println("termsLabel element is not available on web app");
		}
		Thread.sleep(1000);
			
			System.out.println("element counted = " + count);
			if(count==24)
			{
				System.out.println("Sanity on google sign up is pass");
			}
			else
			{
				System.out.println("Sanity on google sign up is fail");
			}
		driver.close();
	}

}
