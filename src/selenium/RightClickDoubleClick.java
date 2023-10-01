package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDoubleClick {
// just a right click demo
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.htmll");
	   driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement  rightclick;
		
		rightclick=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
	   a.contextClick(rightclick).perform();
	   Thread.sleep(1500);
		
		WebElement copy;
		copy=driver.findElement(By.xpath("/html/body/ul/li[3]/span"));
		copy.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.close();
	
		
		
		
		
		
		
		
	}

}
