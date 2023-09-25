package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonWebelement {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("user-name")); //username
		
		username.sendKeys("VISHNUVISH");
		
		WebElement password = driver.findElement(By.id("password")); // password
		
		password.sendKeys(" password ");
		
		//click login button
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		Thread.sleep(2000);
		
		
		// to find the position of x and y(position of login button)
		
		Point location = login.getLocation(); // location = variable
		
		int x= location.getX();
		int y = location.getY();
		
		System.out.println(" X location is :" + x );
		System.out.println("Y location is : "  + y);
		
		
		
		
	driver.close();
		
		
	}

}
