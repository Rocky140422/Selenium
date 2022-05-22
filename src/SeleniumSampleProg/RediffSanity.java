package SeleniumSampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSanity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver.", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		WebElement rediffLink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
		WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
		WebElement greyBar = driver.findElement(By.xpath("//div[@class='greybar']"));
		WebElement newUserLable = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement grey1Label = driver.findElement(By.xpath("//p[@class='grey1']"));
		WebElement fNameLabel = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		WebElement fNameTextBox = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailIdLabel = driver.findElement(By.xpath("//div[text()='Your current email ID']"));
		WebElement emailIdTextBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement exLabel = driver.findElement(By.xpath("//p[text()='eg: myname@gmail.com,  myname@yahoo.com']"));
		WebElement newPassLabel = driver.findElement(By.xpath("//div[text()='New password']"));
		WebElement newPassTextBox = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement repassLabel = driver.findElement(By.xpath("//div[text()='Retype password']"));
		WebElement repassTextBox = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement genderLabel = driver.findElement(By.xpath("//div[text()='Gender:']"));
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value='f']"));
		WebElement dateOfBirthLabel = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationLabel = driver.findElement(By.xpath("//div[text()='Location']"));
		WebElement locationTextBox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement schoolLabel = driver.findElement(By.xpath("//div[text()='School']"));
		WebElement schoolTextBox = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement collegeLabel = driver.findElement(By.xpath("//div[text()='College']"));
		WebElement collegeTextBox = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement captcha = driver.findElement(By.xpath("//img[@name='img_captcha']"));
		WebElement enterCodeLabel = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
		WebElement enterCodeTextBox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		WebElement signUpBtn = driver.findElement(By.xpath("//input[@value='Sign up']"));
		WebElement rediffOnTheNetLogo = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
		WebElement footer = driver.findElement(By.xpath("//div[@class='footer']"));
		WebElement investorInfoLink = driver.findElement(By.xpath("//a[text()='Investor Information']"));
		WebElement advertiseLink = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
		WebElement disclaimerLink = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
		WebElement privacylabel = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebElement feedbackLabel = driver.findElement(By.xpath("//a[text()='Feedback']"));
		WebElement termsOfUseLabel = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		
		int count = 0;
		
		if(rediffLink.isDisplayed())
		{
			System.out.println("rediffLink element is available on web app");
			count++;
		}
		else
		{
			System.out.println("rediffLink element is not available on web app");
		}
		
		if(rediffLogo.isDisplayed())
		{
			System.out.println("rediffLogo element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("rediffLogo element is not availabe on web app");
		}
		
		if(greyBar.isDisplayed())
		{
			System.out.println("greyBar element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("greyBar element is not availabe on web app");
		}
		
		if(newUserLable.isDisplayed())
		{
			System.out.println("newUserLable element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("newUserLable element is not availabe on web app");
		}
		
		if(grey1Label.isDisplayed())
		{
			System.out.println("grey1Label element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("grey1Label element is not availabe on web app");
		}
		
		if(fNameLabel.isDisplayed())
		{
			System.out.println("fNameLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("fNameLabel element is not availabe on web app");
		}
		
		if(fNameTextBox.isDisplayed())
		{
			System.out.println("fNameTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("fNameTextBox element is not availabe on web app");
		}
		
		if(emailIdLabel.isDisplayed())
		{
			System.out.println("emailIdLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("emailIdLabel element is not availabe on web app");
		}

		if(emailIdTextBox.isDisplayed())
		{
			System.out.println("emailIdTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("emailIdTextBox element is not availabe on web app");
		}
		
		if(exLabel.isDisplayed())
		{
			System.out.println("exLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("exLabel element is not availabe on web app");
		}
		
		if(newPassLabel.isDisplayed())
		{
			System.out.println("newPassLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("newPassLabel element is not availabe on web app");
		}
		
		if(newPassTextBox.isDisplayed())
		{
			System.out.println("newPassTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("newPassTextBox element is not availabe on web app");
		}
		
		if(repassLabel.isDisplayed())
		{
			System.out.println("repassLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("repassLabel element is not availabe on web app");
		}
		
		if(repassTextBox.isDisplayed())
		{
			System.out.println("repassTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("repassTextBox element is not availabe on web app");
		}
		
		if(genderLabel.isDisplayed())
		{
			System.out.println("genderLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("genderLabel element is not availabe on web app");
		}
		
		if(maleRadioBtn.isDisplayed())
		{
			System.out.println("maleRadioBtn element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("maleRadioBtn element is not availabe on web app");
		}
		
		if(femaleRadioBtn.isDisplayed())
		{
			System.out.println("femaleRadioBtn element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("femaleRadioBtn element is not availabe on web app");
		}
		
		if(dateOfBirthLabel.isDisplayed())
		{
			System.out.println("dateOfBirthLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("dateOfBirthLabel element is not availabe on web app");
		}
		
		if(dayDropDown.isDisplayed())
		{
			System.out.println("dayDropDown element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("dayDropDown element is not availabe on web app");
		}
		
		if(monthDropDown.isDisplayed())
		{
			System.out.println("monthDropDown element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("monthDropDown element is not availabe on web app");
		}
		
		if(yearDropDown.isDisplayed())
		{
			System.out.println("yearDropDown element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("yearDropDown element is not availabe on web app");
		}
		
		if(locationLabel.isDisplayed())
		{
			System.out.println("locationLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("locationLabel element is not availabe on web app");
		}
		
		if(locationTextBox.isDisplayed())
		{
			System.out.println("locationTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("locationTextBox element is not availabe on web app");
		}
		
		if(schoolLabel.isDisplayed())
		{
			System.out.println("schoolLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("schoolLabel element is not availabe on web app");
		}
		
		if(schoolTextBox.isDisplayed())
		{
			System.out.println("schoolTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("schoolTextBox element is not availabe on web app");
		}
		
		if(collegeLabel.isDisplayed())
		{
			System.out.println("collegeLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("collegeLabel element is not availabe on web app");
		}
		
		if(collegeTextBox.isDisplayed())
		{
			System.out.println("collegeTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("collegeTextBox element is not availabe on web app");
		}
		
		if(captcha.isDisplayed())
		{
			System.out.println("captcha element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("captcha element is not availabe on web app");
		}
		
		if(enterCodeLabel.isDisplayed())
		{
			System.out.println("enterCodeLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("enterCodeLabel element is not availabe on web app");
		}
		
		if(enterCodeTextBox.isDisplayed())
		{
			System.out.println("enterCodeTextBox element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("enterCodeTextBox element is not availabe on web app");
		}
		
		if(signUpBtn.isDisplayed())
		{
			System.out.println("signUpBtn element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("signUpBtn element is not availabe on web app");
		}
		
		if(rediffOnTheNetLogo.isDisplayed())
		{
			System.out.println("rediffOnTheNetLogo element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("rediffOnTheNetLogo element is not availabe on web app");
		}
		
		if(footer.isDisplayed())
		{
			System.out.println("footer element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("footer element is not availabe on web app");
		}
		
		if(investorInfoLink.isDisplayed())
		{
			System.out.println("investorInfoLink element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("investorInfoLink element is not availabe on web app");
		}
		
		if(advertiseLink.isDisplayed())
		{
			System.out.println("advertiseLink element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("advertiseLink element is not availabe on web app");
		}
		
		if(disclaimerLink.isDisplayed())
		{
			System.out.println("disclaimerLink element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("disclaimerLink element is not availabe on web app");
		}
		
		if(privacylabel.isDisplayed())
		{
			System.out.println("privacylabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("privacylabel element is not availabe on web app");
		}
		
		if(feedbackLabel.isDisplayed())
		{
			System.out.println("feedbackLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("feedbackLabel element is not availabe on web app");
		}
		
		if(termsOfUseLabel.isDisplayed())
		{
			System.out.println("termsOfUseLabel element is availabe on web app");
			count++;
		}
		else
		{
			System.out.println("termsOfUseLabel element is not availabe on web app");
		}
		System.out.println("Counted element = "+  count );
		if(count==39)
		{
			System.out.println("Sanity test pass");
		}
		else
		{
			System.out.println("Sanity test fails");
		}
		
		driver.close();

	}

}
