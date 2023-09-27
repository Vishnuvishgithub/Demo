package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		//boot starp dropdown comes normally in a button class with Unordered List and List 
		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.w3schools.com/bootstrap5/bootstrap_dropdowns.php");
	     driver.manage().window().maximize();
	     Thread.sleep(1500);
		
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/button"));
	  
	  Thread.sleep(1000);
		
	List<WebElement> link1=driver.findElements(By.xpath("//*[@id=\"main\"]/div[3]/ul/li[1]/a"));
	
	int total=link1.size();
	System.out.println(total);
	
	for (int i=0; i<total;i++)
	{
		System.out.println(link1.get(i).getText());
	}
	
	
	
	
	
	
	
	
	
	
	}

}
