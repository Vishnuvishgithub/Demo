package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
			
	  driver.manage().window().maximize();
	  
	  //to find the frame location and use switch to
	  
	  WebElement frame= driver.findElement(By.xpath(" //*[@id=\"content\"]/iframe"));
	  
	  driver.switchTo().frame(frame);   // use switch to
	  
	  
	   
	  WebElement Resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	  
	  //to find the location of x and y co0rdinates
	  
	  Point loc=Resize.getLocation(); //using point method
	  
	  int x= loc.getX();
	  int y = loc.getY();
	  System.out.println(x + " " + y);
	  
	  
	  Actions a=new Actions(driver);
	  
	  a.dragAndDropBy(Resize, 300, 100).perform();
	  
	
	driver.close();
	}

}
