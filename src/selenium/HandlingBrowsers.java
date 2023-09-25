package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingBrowsers {
    public static void main(String[] args) throws InterruptedException {
       
        
        WebDriver driver = new ChromeDriver();
        
       
        driver.get("http://www.google.com"); // launch the website
        
        Thread.sleep(3000);     // slowdown for 3 milliseconds
  
        driver.manage().window().maximize();   // maximise the browser
        
        driver.manage().window().minimize(); // minimise the browser
        
    
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        
        // To resize the current window to a particular dimension 
        
        System.out.println(driver.manage().window().getSize());
        Dimension d = new Dimension(420,600);
        driver.manage().window().setSize(d);
        
        
        String pageTitle = driver.getTitle();  //Return the Page Title 
        System.out.println(pageTitle);
        
        String currentURL=driver.getCurrentUrl();  //Return the current URL
        System.out.println(currentURL);
        
        
        
        driver.navigate().to("https://www.selenium.dev/"); // navigate to the another URL page
        Thread.sleep(3000);           
        
        driver.navigate().back();
        Thread.sleep(5000);
    
       driver.navigate().forward();
       Thread.sleep(3000);
     
       driver.navigate().refresh();
       Thread.sleep(3000);
       
       
       driver.close();     // close the browser
       
       
    
    }
}
        
