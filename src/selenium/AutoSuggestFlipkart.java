package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestFlipkart {

	public static void main(String[] args) throws InterruptedException {
	

  	    WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        
        driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
        Thread.sleep(1000);
        
        WebElement search;
       search= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input"));
       search.sendKeys("watches") ;
       Thread.sleep(1000);

		
		// to find the count of auto suggestions
       
       List<WebElement> auto= driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/ul/li"));
		
		int count=auto.size();
		System.out.println(count);
		Thread.sleep(1000);
		
		//to print the text 
		
		for (WebElement e : auto)
		{
			System.out.println(e.getText());
		}
		
		// to click any of the auto text
		
		for (int i=0;i<count;i++)
			
			  {
			   if (auto.get(i).getText().contains("watches for men"))
			   {
				   auto.get(i).click();
			   }
			
			
				}
		
		driver.close();
		

	}

}
