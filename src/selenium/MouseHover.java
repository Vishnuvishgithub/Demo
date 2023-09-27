package selenium;

import org.openqa.selenium.interactions.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
			
	   driver.manage().window().maximize();
	  
	
	  WebElement ele= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[7]/span"));
	  
	  Actions act= new Actions(driver);   // actions class used to perform action on any webelement
	  
	 // MouseHover
	  
	  act
	  
	  .moveToElement(ele)
	  .moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[8]/div/div[3]/a[3]/p")));
	  
	  
	 
	  
	  
	  
	  
	  
	  
	
}
}