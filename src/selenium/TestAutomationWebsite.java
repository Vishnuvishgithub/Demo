package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();	
		
		WebElement name;
	    name=driver.findElement(By.id("name"));
		name.sendKeys("VISHNU VISH");
		Thread.sleep(1000);
		
		//To get the name ,use getattribute method by passing 'title' or 'value'
		String namebox=name.getAttribute("value");
		System.out.println("Name :" + namebox);
		Thread.sleep(1000);
		
		WebElement email;
		email=driver.findElement(By.id("email"));
		email.sendKeys("vishnuvish@gmail.com");
		Thread.sleep(1000);
		
		//To get the emailtext ,use getattribute method by passing 'title' or 'value'
		String emailbox=email.getAttribute("value");
		System.out.println("Email id : " + emailbox);
		Thread.sleep(1000);
		
		WebElement phone;
		phone=driver.findElement(By.id("phone"));
		phone.sendKeys("1234567897");
		
		 //To get the phone ,use getattribute method by passing 'title' or 'value'
			String phone1=phone.getAttribute("value");
			System.out.println("Phone Number : " +phone1);
			Thread.sleep(1000);
				
		  WebElement address; 
         address=driver.findElement(By.id("textarea"));
         address.sendKeys("COIMBATORE , TAMILNADU");
         Thread.sleep(1000);
		 
     //To get the address ,use getattribute method by passing 'title' or 'value'
		String add=address.getAttribute("value");
		System.out.println("Address :" + add);
		Thread.sleep(1000);
		
    // Radiobutton
		WebElement radio1,radio2;
		
		radio1=driver.findElement(By.id("male"));
		radio2=driver.findElement(By.id("female"));
		radio2.click();
				
		if (radio2.isSelected())
		{
			System.out.println("FEMALE RADIOBUTTON IS SELECTED");
		}
		else
		{
			System.out.println("NOT SELECTED");
		}
				
		// To find the total number of radio buttons in a page 
		List<WebElement> total=	driver.findElements(By.xpath("//*[@name='gender']"));
		int count=total.size();
		System.out.println("Total number of Radio Buttons :" + count);
		Thread.sleep(1000);
		
		// Multiple Checkbox selection
			WebElement sunday, monday,thursday,saturday;
			
			sunday=driver.findElement(By.id("sunday"));
			sunday.click();
		
			monday=driver.findElement(By.id("monday"));
			monday.click();
			Thread.sleep(1000);
			
		    thursday=driver.findElement(By.id("thursday"));
			thursday.click();
			Thread.sleep(1000);
			thursday.click();
		
			saturday=driver.findElement(By.id("saturday"));
			saturday.click();
			Thread.sleep(1000);
			
		  System.out.println("Sunday is enabled " + sunday.isEnabled());  // returns boolean 
		  System.out.println("Monday is enabled " + monday.isEnabled());  
		  System.out.println("Thursday is enabled " + thursday.isSelected()); 
		  System.out.println("Saturday is enabled " + saturday.isEnabled());  // returns boolean 
		  Thread.sleep(1000);
			
		  // To get total number of check boxes 
	 List< WebElement> total1=driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
	 int count1 = total1.size();
	 System.out.println("Total number of checkboxes :" + count1);
  
		  
		// DROPDOWN - using select class
	     //Selectbyindex
		//Selectbyvisibletext
		//Selectbyvalue
	 
	  Select country = new Select (driver.findElement(By.id("country")));
	 
	 country.selectByIndex(1);
	 Thread.sleep(1500);
	 
	 country.selectByVisibleText("Germany");
	 Thread.sleep(1500);
	 
	 //To get the drop down list 
	 
	 List <WebElement> total2=driver.findElements(By.xpath("//*[@id=\"country\"]/option"));
	 int count2=total2.size();
	 System.out.println("Total number of countries :" + count2);
	 Thread.sleep(1500);
	 
	 // To get the country text list using forloop
	 /*
	 for (int i=0;i<count2;i++)
	 {
		String value= total2.get(i).getText();
		 System.out.println(  value);
	 }*/
	 
	 // using for each method to iterate 
	   for(WebElement  e : total2)
	   {
		   System.out.println(e.getText());
	   }
	 
		/*  //Multi dropdown  check using boolean ismultiple() method
		 
	   Select colour = new Select(driver.findElement(By.id("colours")));
	   Thread.sleep(1000);
	   
	   //To listout the options in the multi dropbox
		
	 		List<WebElement> options= colour.getOptions();
	 		// use foreach method to print
				for (WebElement i: options  )     
			{
				System.out.println(i.getText());    // to get the options in text
			}
	   
	    boolean b= colour.isMultiple();
	    System.out.println("Check whether the dropdown is multi select or not :" +  b );
	   
	  colour.selectByIndex(1)   ;
	 colour.selectByVisibleText(" green");
	   
		// print the first selected option
		
		WebElement first=colour.getFirstSelectedOption();
		System.out.println(first.getText());
		
		 // Print all the selected options 
		
		List<WebElement> alloptions=colour.getAllSelectedOptions();
		for(WebElement all:alloptions )
		{
			System.out.println(all.getText());
		} */
	   
		 // Date picker
		  
	 // opencart
	   
	   WebElement opencart;
	 opencart=  driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/a[1]"));
	 opencart.click();
	 
	 driver.navigate().back();
	   
		  
		  
		  
	}

}
