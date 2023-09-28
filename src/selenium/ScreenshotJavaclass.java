package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotJavaclass {

	public static void main(String[] args) throws IOException, AWTException {
		

        WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();	
		
		//screenshot using java class 'robot'

		
            // Create a Robot object
            Robot robot = new Robot();
           
            // Get the screen size
            Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
            
            Rectangle rect = new Rectangle(screensize);
            
            // Capture the screen
            BufferedImage source = robot.createScreenCapture(rect);
            
            // Save the image to a file
            File dest = new File("C:\\Users\\VISHNU\\Desktop\\selenium\\screenshot.png");
            ImageIO.write(source, "png", dest);
            
		
		
	}

}
