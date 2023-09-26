package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/resizable");
			
	  driver.manage().window().maximize();
	  
	   WebElement resize=driver.findElement(By.id("resizable"));
	  
	  Actions a=new Actions(driver);
	  
	  //to find the location
	  
	  Point loc= resize.getLocation();
	  
	  int x= loc.getX();
	  int y= loc.getY();
	  
	  System.out.println(x + " " +y);
	  
	  
	  a.clickAndHold(resize).moveByOffset(250, 300).perform();
	  
	  
	  
	
	
	}

}
