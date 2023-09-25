package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssElementcColor {

	public static void main(String[] args) {
		
		
     WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();

		 // to find the background color
		
		 WebElement button=driver.findElement(By.id("BE_flight_flsearch_btn"));
		 
		 String bgcolor=button.getCssValue("Background");
		 System.out.println("Background colour is :" + bgcolor);
		 
	   // to find the border color
		 
		  WebElement button1=driver.findElement(By.xpath("//a[@title='One Way']"));
		 
		 String bordercolor=button1.getCssValue("border-color");
		 
		 System.out.println("Border color is : " + bordercolor);
	
	// To find out the text color 
		 WebElement button2=driver.findElement(By.xpath(" //a[@title='Round Trip']"));
		 
		 String textcolor=button2.getCssValue("color");
		 System.out.println("TEXT COLOR IS :" + textcolor);
		 
		 
		 
		 
		 
		 driver.close();
	
	}

}
