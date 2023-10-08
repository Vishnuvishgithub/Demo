package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_Demoqa_Website {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\VISHNU\\eclipse-workspace\\Demo\\src\\or.properties"); 
		Properties pro = new Properties();
		pro.load(file);
		
       WebDriver driver = new ChromeDriver();
	    driver.get(pro.getProperty("url"));
	     driver.manage().window().maximize();
	
		WebElement fname,lname;
		
		fname=driver.findElement(By.xpath(pro.getProperty("firstname")));
		fname.sendKeys(pro.getProperty("fkeys"));
		
		lname=driver.findElement(By.xpath(pro.getProperty("lastname")));
		lname.sendKeys(pro.getProperty("lkeys"));
		
		WebElement email;
		
		email=driver.findElement(By.xpath(pro.getProperty("email")));
		email.sendKeys(pro.getProperty("emailid"));
		
		WebElement radio;
		
		radio= driver.findElement(By.xpath(pro.getProperty("female")));
		radio.click();
		
		
		
	}

}
