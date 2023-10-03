package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAWFrames {

	public static void main(String[] args) {
	
		
		  WebDriver driver = new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();	
	    
			
			  WebElement frame;
	            frame=driver.findElement(By.xpath("//*[@id=\"FSForm\"]/div[2]"));
	           driver.switchTo().frame(frame);
	           
			
	       WebElement name1;
	       name1=driver.findElement(By.id("RESULT_TextField-0"));
	       name1.sendKeys("VISHNU AUTOMATION");
	          
	        System.out.println(name1.getAttribute("value"));
	        
		
	
	}

}
