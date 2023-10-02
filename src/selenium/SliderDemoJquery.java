package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemoJquery {

	public static void main(String[] args) {
		
	
	    WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
	   driver.manage().window().maximize();
		
	  // iframe
	   WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	   driver.switchTo().frame(frame);
	
	WebElement greenslider=driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
	
	Actions a = new Actions(driver);
	
	a.dragAndDropBy(greenslider, 100, 125).perform();
	
	
}
}
