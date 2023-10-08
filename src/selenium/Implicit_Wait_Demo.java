package selenium;


// Implicit wait Is applicable for all the Web elements in the page tp ause a certain amount of time
//

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicit_Wait_Demo {

	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait 
	
		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		// for mouse hover over the electronics 
		Actions a= new Actions(driver);
		a.moveToElement(electronics).perform();
		
		// for clicking the smartwatches
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[5]/a")).click();
		// if click , it shows ELEMENT NOT INTERACTABLE EXCEPTION
		//HENCE USE IMPLICIT WAIT
		
	}

}
