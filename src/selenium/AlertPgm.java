package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgm {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/?m=1https://testautomationpractice.blogspot.com/?m=1");
			
	  driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]"));
		alert.click();
		
		Thread.sleep(3000);
	
		Alert al=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		al.accept();
		
		
		WebElement button=driver.findElement(By.xpath(" //*[@id=\"HTML9\"]/div[1]/button[2]"));
		
		button.click();
		
		Alert but= driver.switchTo().alert();
		
		System.out.println(but.getText());  // print the text inside the box
		
		Thread.sleep(3000);
		
		but.dismiss();
		
		
		WebElement prompt=driver.findElement(By.xpath(" //*[@id=\"HTML9\"]/div[1]/button[3]"));
		
		prompt.click();
		
		Alert pr= driver.switchTo().alert();
		
		System.out.println(pr.getText());

		
		pr.sendKeys("VISHNU") ;
		
		Thread.sleep(3000);
		
		pr.accept();
		
		
		driver.close();
		
		
	}

}
