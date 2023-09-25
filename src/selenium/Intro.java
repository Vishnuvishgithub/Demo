package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
		
		driver.close();
		
	}

}
