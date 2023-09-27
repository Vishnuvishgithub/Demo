package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipCss {

	

	public static void main(String[] args) {
		
	// when tooltip comes under css Div tag	
		
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.w3schools.com/css/css_tooltip.asp");
	     driver.manage().window().maximize();
		
	WebElement top= driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div"));
	
	WebElement tip= driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/span")); // comes under span tag
	    
	   Actions ac = new Actions(driver ) ;
	    ac.moveToElement(top).perform();
	    
	    String tooltip = tip.getText();
	    System.out.println(tooltip);
	    
	    
	    
	    

	}

}
