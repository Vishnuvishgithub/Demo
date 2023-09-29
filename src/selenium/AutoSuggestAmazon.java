package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestAmazon {

	public static void main(String[] args) throws InterruptedException {
		

  	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

		
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
     Thread.sleep(1500);
   
   // to find the count of auto suggestions
  
    List<WebElement> auto= driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div"));
 
    int count= auto.size();
    System.out.println(count);
    Thread.sleep(1000);
		
	// using foreach method to iterate and get the elements using gettext()
     for (WebElement e : auto)
    	{
    	
    	   System.out.println(e.getText());
    	
    	  }
    
		
		
		driver.close();
		
		
		
		
	}

}
