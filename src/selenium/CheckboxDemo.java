package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		

     WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sunday")).click();
		
		driver.findElement(By.id("monday")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("thursday")).click();
	
		driver.findElement(By.id("thursday")).click(); // click again to deselect
		
		Thread.sleep(3000);
	
		
		// To find the total number of checkboxes 
		
		List<WebElement> total= driver.findElements(By.xpath(" //*[@type='checkbox']"));
		
		int size=total.size();
		
		System.out.println(size);
		
		
		driver.close();
		
	
	}

}
