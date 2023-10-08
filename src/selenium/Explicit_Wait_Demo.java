package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//Explicit waitis applicable for the particular web element in the page for a specific amount of time 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_Wait_Demo {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver(); 
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait 
		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		// for mouse hover over the electronics 
		Actions a= new Actions(driver);
		a.moveToElement(electronics).perform();
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();
	
		
		
		
		
		

	}

}
