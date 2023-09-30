package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPriceSorting {

	public static void main(String[] args) {
	
		  WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			//driver.manage().window().maximize();	

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 12");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		// use list to find the number of elements
		
		List<WebElement> total= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int count=total.size();
		
		System.out.println(count);
	
		for (WebElement e : total)  // using foreach method to iterate the elements 
		{
			System.out.println(e.getText());
		}
		
		// to sort out the price range from  highest to lowest 
		// USing String Array
		
		String[] price= {"48,990","61,999","48,990","63,999","	64,900","	63,999","61,999","12,999","64,999"};
		
		Arrays.sort(price);
		System.out.println(Arrays.toString(price)); // tostring method to print the values ,since we hav taken string Array
				
		
	}

}
