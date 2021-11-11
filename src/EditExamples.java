package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
           WebElement emailBox=driver.findElement(By.id("email"));
	       emailBox.sendKeys("stephen@mailinator.com");
	
	       WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
	       appendBox.sendKeys("Goindha");
	       
	       WebElement getTextBox=driver.findElement(By.name("username"));
	       String value= getTextBox.getAttribute("value");
	       System.out.println(value);
	       
	       WebElement clearBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	       clearBox.clear();

	       WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
	       boolean enabled= disabledBox.isEnabled();  
	       System.out.println(enabled);
	       

	}

}
