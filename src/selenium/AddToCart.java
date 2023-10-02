package selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddToCart {


	public static void main(String[] args) {
		

        WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
    // Using windowhandles 
		
		Set <String> S=driver.getWindowHandles();
		ArrayList<String> ar= new ArrayList(S);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		driver.switchTo().window((String) ar.get(1));
	
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[1]/div/div[2]/div[4]/div[4]/div/form/div/div[1]/span/span/span/input")).click();
		
	}

}
