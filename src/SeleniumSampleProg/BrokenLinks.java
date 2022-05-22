package SeleniumSampleProg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++){
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpCon = (HttpURLConnection) link.openConnection();
			int resCode = httpCon.getResponseCode();
			if(resCode>400){
				System.out.println(url +"--> is broken link");
			}
			else{
				System.out.println(url + "--> is valid link");
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

}
