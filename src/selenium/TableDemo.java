package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		

		 WebDriver driver = new ChromeDriver();
	     driver.get("https://testautomationpractice.blogspot.com");
	     driver.manage().window().maximize();
	
	     
	 //to find out the no of columns in a table , use tagname locator
  // here since the webpage has two tables , we use full xpath to find the no of columns and rows
	     
	     
	List<WebElement> table= driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/th"));
	
	int size=table.size();
	System.out.println(size);
	
	
	// to find the no if rows in a table 
	
	List<WebElement> tablerow=driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr"));
	
	System.out.println(tablerow.size());
	
	
	// to get a data in a table
	
	
	WebElement data= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[5]/td[1]"));
	
	System.out.println(data.getText());
	
	
	
	
	driver.close();
	
	
	
	
	
	
	}

}
