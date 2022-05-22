package SeleniumPractise;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//How to capture cookies from browser?
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("size of coolies: " + cookies.size());
		
		//How to print cookies from browser?
		for(Cookie cookie:cookies){
			System.out.println(cookie.getName()+" "+cookie.getExpiry()+" "+cookie.getValue());
			
		}
		
		//How to add cookie to the browser?
		Cookie cookieObj =new Cookie("MyCookie","12345");
		driver.manage().addCookie(cookieObj);
		Set<Cookie> cookies1 = driver.manage().getCookies();
		System.out.println("size of coolies after adding: " + cookies1.size());
		for(Cookie cookie1:cookies1)
		System.out.println(cookie1.getName()+" "+cookie1.getExpiry()+" "+cookie1.getValue());
		
		//How to delete specific cookie from the browser?
		//driver.manage().deleteCookie(cookieObj);
		driver.manage().deleteCookieNamed("MyCookie");
		cookies = driver.manage().getCookies();
		System.out.println("size of coolies after deletion: " + cookies.size());
		
		//How to delete all the cookies from the browser?
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("size of coolies after deletion: " + cookies.size());
		Thread.sleep(3000);
		driver.close();

	}

}
