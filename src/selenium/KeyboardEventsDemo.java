package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
	   driver.manage().window().maximize();

		WebElement sourcetextarea;
		sourcetextarea=driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		
		// use actions class keyboard method 
		Actions a=new Actions (driver);
		Thread.sleep(2000);
		a.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement destarea;
		destarea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]//div[5]/pre/span"));
		Thread.sleep(2000);
		
		a.keyDown(destarea, Keys.CONTROL).sendKeys("v").build().perform();
		
		
		
	}

}
