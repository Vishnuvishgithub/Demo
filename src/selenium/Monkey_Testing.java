package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monkey_Testing {
//Random testing of  the links 
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(1000);
			driver.manage().window().maximize();	
		
		List<WebElement> footer=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a "));
		
		int footer_count=footer.size();
		System.out.println("Footer count is : " + footer_count);
		

		for (int i = 0; i < footer_count; i++) 
		{
			int random = (int) Math.floor(Math.random()*footer_count);
			System.out.println("Random index : " + random);
	
			WebElement test = footer.get(random);
			System.out.println(test.getText());
			test.click();
			driver.navigate().back();
			Thread.sleep(2000);
			footer = driver.findElements(By.cssSelector("div.navFooterVerticalRow li a "));				
					
		}
				
		
	}

}
