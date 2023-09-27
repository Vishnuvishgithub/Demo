package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class ToolTip {

	public static void main(String[] args) {
		
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://jqueryui.com/tooltip/");
    
    driver.manage().window().maximize();
   
    
    // since there is one frame in the page, use switchto method and frame index
    driver.switchTo().frame(0); 
    
    WebElement tool= driver.findElement(By.xpath("//*[@id=\"age\"]"));
    
    System.out.println(tool.getAttribute("title"));  // or get in a string text and sop
    
    
	
	
	
	
	
	
	
	
	}

}
