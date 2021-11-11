package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. get xy position
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		 	WebElement getPositionButton=driver.findElement(By.id("position"));
		Point xypoint=getPositionButton.getLocation();
		int  xValue=xypoint.getX();
		int  yValue=xypoint.getY();
		
		System.out.println("X value is:" +xValue +"Y value is:"+yValue);
		 
		//2.find the color.
		
		WebElement colorButton=driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("Button color is :" +color);
		
		//3.Find the size of the button
		
		WebElement Sizebutton=driver.findElement(By.id("size"));
		int Height=Sizebutton.getSize().getHeight();
		int Width =Sizebutton.getSize().getWidth();
		System.out.println("Height is :"+Height + "Width is :"+Width);
		
		//4.Click on Go to home
		
		WebElement HomeButton=driver.findElement(By.id("home"));
		HomeButton.click();
		
		
		
		

	}

}
