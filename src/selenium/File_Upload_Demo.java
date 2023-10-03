package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Demo {

	public static void main(String[] args) throws AWTException {
		

        WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();	
		
		
	//	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	//robot.keyRelease(KeyEvent.VK_PAGEDOWN);
		
		WebElement upload;
		upload=driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn__text"));
		upload.click();
		
		//Copy the file
		
		StringSelection ss= new StringSelection("C:\\Users\\VISHNU\\Desktop\\SQL_PPT");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Robot class 
		
		Robot robot = new Robot ();
		robot.delay(250);
		
		//Paste the file
		
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
