package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jsexec =   (JavascriptExecutor)driver;
		
		// print the title 
		String script= " return document.title ;" ;
		String title =     (String) jsexec.executeScript(script);
		
        System.out.println(title);
        
        // click the button 
        
        driver.switchTo().frame("iframeResult");
        
		jsexec.executeScript("myFunction()");	
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	
	// highlight
	
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px solid red'", button);
		
		// Scroll the page 
		
		driver.navigate().to("https://www.w3schools.com/");
		
		WebElement certifiedbutton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div[1]/a[3]"));
		
		jsexec.executeScript("arguments[0].scrollIntoView(true) ; " ,   certifiedbutton);
		
		
		
		
		
	}

}
