package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver = new ChromeDriver();
			
			//driver.get("https://demoqa.com/draggable");
			
		 driver.get("https://demoqa.com/droppable");
			
			
			driver.manage().window().maximize();
			Thread.sleep(2000); 

		
		/*WebElement drag =driver.findElement(By.id("dragBox"));
			
	
			Actions a=new Actions(driver);
	      a.dragAndDropBy(drag, 200, 100).build().perform();*/
	
			
			WebElement drag1= driver.findElement(By.id("draggable"));
			
			WebElement drop= driver.findElement(By.id("droppable"));
			
			Actions b=new Actions(driver);
			
			b.dragAndDrop(drag1, drop).build().perform();
		
		
		
		
		 driver.close();
		
		
		
		
		
		
		
		
	}

}
