package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/plan-travel/");
		driver.manage().window().maximize();	
		
		//to take a screenshot .using selenium method
	
	   
		// 1.Convert WebDriver object to TakesScreenshot 
		TakesScreenshot scrShot = ((TakesScreenshot)driver);

		// 2.Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// 3.Move image file to new destination
		File DestFile = new File("C:\\Users\\VISHNU\\Downloads\\sample\\screenshot.png"); // png/jpg/jpeg

		// 4.Copy file at destination
		FileHandler.copy(SrcFile, DestFile);

		
		
		
	}

}
