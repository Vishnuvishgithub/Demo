package selenium;

// text and button 

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class Webelements1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
	   driver.get("https://testautomationpractice.blogspot.com/" );
		
		driver.manage().window().maximize();
		
		
		WebElement namebox=driver.findElement(By.id("name"));
		
		namebox.sendKeys("VISHNU");
		
		Thread.sleep(3000);
		
		// to get the entered text in sendkeys use getattribute() method
		
		String text= namebox.getAttribute("value");
		System.out.println(text);
		
		// To check the text box contains  text or not 
	   if (text.contains("VISHNU"))
	   {
		   System.out.println("YES");
	   }
	   else
	   {
		   System.out.println("NO");
	   }
		
	   
	 
		
	    
	  
	   
	 
	   
	   
	   
	   driver.close();

		
		
	}

}
