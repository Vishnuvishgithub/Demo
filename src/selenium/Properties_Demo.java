package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Read write from the properties file 
public class Properties_Demo {

	public static void main(String[] args) throws IOException {
		
		// Create an instance for Properties class
		
		// For loading the file ,  use inputstream class
		
		FileInputStream file = new FileInputStream ("C:\\Users\\VISHNU\\eclipse-workspace\\Demo\\src\\or.properties"); 
		Properties pro = new Properties();
		pro.load(file);
			
       System.out.println( pro.getProperty("browser"));  // use getproperty method to read the file  
       System.out.println( pro.getProperty("url"));
				
		
       // to write the file 
       
       FileOutputStream file1= new    FileOutputStream("C:\\Users\\VISHNU\\eclipse-workspace\\Demo\\src\\or.properties") ;      
       
       pro.setProperty("VISHNU", "TESTER");
       pro.store(file1, "THIS IS CUSTOMER DATA FROM TC2");
       
       
	}

}
