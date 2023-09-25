package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000); 

		
		Select s= new Select(driver.findElement(By.id("cars")));
		
		//to listout the options in the multi dropbox
		
		List<WebElement> options= s.getOptions();
		
		// use foreach method to print
		
		for (WebElement i: options  )     
		{
			System.out.println(i.getText());    // to get the options in text
		}
		
		
		boolean b=s.isMultiple();
		System.out.println(b);
		
		 s.selectByIndex(1);
		
		s.selectByVisibleText(" Audi" );
		
		
		// print the first selected option
		
		WebElement first=s.getFirstSelectedOption();
		System.out.println(first.getText());
		
		
		 // Print all the selected options 
		
		List<WebElement> alloptions=s.getAllSelectedOptions();
		
		for(WebElement all:alloptions )
		{
			System.out.println(all.getText());
		}
		
		s.deselectAll();
		
		driver.close();
		
		
	}

}
