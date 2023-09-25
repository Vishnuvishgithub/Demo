package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		
		
    WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.manage().window().maximize();
		
		
		WebElement male= driver.findElement(By.id("male"));		
		WebElement female= driver.findElement(By.id("female"));		
		
		female.click();
		
		
		System.out.println(male.isSelected()); // returns boolean
		
		System.out.println(female.isSelected()); //returns boolean
		
		
		// to find the total number of radio buttons in a page 
		
		List<WebElement> total=driver.findElements(By.xpath("//*[@name='gender']"));//select common attribute
		
		int size=total.size();
		System.out.println(size);
		
		
		
		
		
		
		
		
		driver.close();
		

	}

}
