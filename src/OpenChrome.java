package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
       
		//1.open Chrome
		//2.Google Home Page
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Training\\\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
 
	}

}
