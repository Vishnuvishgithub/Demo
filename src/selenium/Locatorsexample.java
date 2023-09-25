package selenium;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Locatorsexample {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000); // for slowdown 


       String title = driver.getTitle();         //returns the title
       System.out.println(title);
	 
	  String currentURL=driver.getCurrentUrl();  //returns the current URL
	  System.out.println(currentURL);
	
	/* WebElement search = driver.findElement(By.name("searchVal")); // this element is inspected and stored in the variable  search 
	
	  Thread.sleep(2000);
	 search.sendKeys("shoes" );   
	 search.submit();
	 Thread.sleep(5000);
	 
	 driver.navigate().back();
	 
	 WebElement link = driver.findElement(By.linkText("HOME AND KITCHEN"));
	 link.click();
	 
	 WebElement link2= driver.findElement(By.linkText("INDIE"));       
	 link2.click();
	 
	 WebElement link3=driver.findElement(By.partialLinkText("WOM"));
	 link3.click();*/
	
	 // find the total number of links in a page use Tagname 
	  
	List<WebElement> totallink= driver.findElements(By.tagName("a"));
	int size = totallink.size();
	System.out.println(size);
			
	 // By  Absolute Xpath  copy fullxpath  Always starts with the root html node
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[2]/div/div/a[2] ")).click();
	 
	// By Relative XPath   copy xpath    Always starts with the current node 
	
	driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[4]/a ")).click();
	  
	 Thread.sleep(2000);
 
	 // To write our  our own Xpath The  syntax is Xpath= //Tagname[@Attribute='value']
	 
	 driver.findElement(By.xpath(" //input[@name='searchVal']")).click();
	 
	 // Using AND / OR Xpath 
	 
	 driver.findElement(By.xpath("//input[@type='value'  or @name='searchVal'] ")).click();
	 
	 
	 // Using text()  The syntax is //tagname[text()='value'] no attributes should be present 
	 
	 
	 
	 
	 //Using starts-with   the syntax is //tagname[starts-with(@attribute,value0]
	 
	 driver.findElement(By.xpath("//a[starts-with(@title,'INDIE')] ")).click();
	 
	
	 // By using CSS Selector Id and Class Attribute 
	// syntax  By.css selector("tag name # id value");
	 //syntax By.css selector("tag name . class value");

	 
	 driver.findElement(By.cssSelector("input.react-autosuggest__input react-autosuggest__input--open"));
	 
	 
	// BY USING CSS SELECTOR href attribute
	 // syntax By.css selector("tag name [ href = 'href value']");
	 
	 
	 driver.findElement(By.cssSelector("a[href='/selfcare']"));
	 
	
	 
	 
	 
	 
	 driver.close();
	
	
	
	

	
	
	}

}
