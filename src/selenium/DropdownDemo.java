package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	//selectbyindex
	//selectbyvisibletext
	//selectbyvalue
	
	public static void main(String[] args) {
		
		
		   WebDriver driver = new ChromeDriver();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			driver.manage().window().maximize();
  
			
			// 1.select the option
	  
	Select dropdown=new Select(driver.findElement(By.id("country")));
	
	//dropdown.selectByIndex(1);
	
	//dropdown.selectByVisibleText("Australia");
	
	dropdown.selectByValue("brazil");
	
	
	// 2. To find the the total  number of options options in dropdown
	
	List<WebElement> count=dropdown.getOptions(); // count has total options
	
	int total = count.size();               // total has number of countreis
	System.out.println(total);
	
	// 3. To get the dropdown values
	
	for (int i=0;i<total;i++)
	{
		String value=count.get(i).getText();
		System.out.println(value);
	}
	
	
	
	driver.close();
	
	}

}
