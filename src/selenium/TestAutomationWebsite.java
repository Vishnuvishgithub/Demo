package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutomationWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();	
		
		// To get the Current URL
		String  currentURL= driver.getCurrentUrl();
		System.out.println("Page URL :" + currentURL);
		
		//To get the Page Title
		String title= driver.getTitle();
		System.out.println("Page Title : " + title);
		
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
	 Thread.sleep(1500);
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
		  
	   WebElement date;
	   date=driver.findElement(By.id("datepicker"));
	   date.click();
	   
	  // use webdriverwait class
	   
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));  // to wait for 10 seconds
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));
	   
	   // locate the current month and current year 
	   String month,year;
	   month=driver.findElement(By.className("ui-datepicker-month")).getText();
	  
	    year= driver.findElement(By.className("ui-datepicker-year")).getText();
	   
	  //use while loop for selelction the forward date and iterate until the condition false
	    // Using And operator to check both conditions are true
	   // Using Not equal to !  to terminate the loop if both conditons are true
	    
	       while (! ( month.equals("July") && year.equals("2024")))  
	    {
			driver.findElement(By.xpath("/html/body/div[5]/div/a[2]/span")).click();
			  month=driver.findElement(By.className("ui-datepicker-month")).getText();
			  year= driver.findElement(By.className("ui-datepicker-year")).getText();
		}
	   
	     //locate the  required date and click
	      driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='23']")).click();
	    
	    
	  //OPENCART
	   
	  WebElement opencart;
	 opencart=  driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/a[1]"));
	 opencart.click();
	 Thread.sleep(1500);
	 
	 String title1=driver.getTitle();
	 System.out.println("Title1 :" + title1);
	 
	 WebElement phones;
	 phones=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[6]/a"));
	 phones.click();
	 Thread.sleep(1000);
	 
	driver.navigate().back();
    
	/*
	//Currency Dropdown
	
	Select currency= new Select(driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/a/span")));
	currency.selectByIndex(2);
	Thread.sleep(1000);
	
	//To list out the total listed  currency in dropdown and get the names of
	
	List<WebElement>  total5= currency.getOptions();
	int  count5=  total5.size();
	System.out.println("Total currency listed in the opencart dropdown :" + count5);
	
	// To iterate using foreach method
	for (WebElement  s : total5) 
	{
		System.out.println(s.getText());
	}
	*/
    Thread.sleep(1500);
	 driver.navigate().back();
	   Thread.sleep(1000);
	   
	   // Orange Hrm Page 
		  
		   WebElement orange;
		   orange=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/a[2]"));
		  orange.click();
		  Thread.sleep(2000);
		  
		  String title2=driver.getTitle();
		  System.out.println("Title2 :" + title2);
		  Thread.sleep(1000);
		/*   // username password login 
		  WebElement username;
		  username=driver.findElement(By.name("username"));
		   username.sendKeys("Admin");
		  Thread.sleep(1000);
		  System.out.println("Username : " + username.getAttribute("value"));
		  
		  WebElement password;
		  password=driver.findElement(By.name("password"));
		  password.sendKeys("admin123");
		  Thread.sleep(1000);
		  System.out.println("Username :" + password.getAttribute("value"));
		 
		  WebElement login;
		  login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		  login.click();
		  
		  //To find the login button colour
		  
		  WebElement loginbutton;
		  loginbutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		  
		  //To find the background colour
		  
		  String Bgcolour=loginbutton.getCssValue("Background");
		  System.out.println("Bgcolour of Login Button is :" + Bgcolour);
		  Thread.sleep(1000);
		  */
		  driver.navigate().back();
		  
		   //To find out the no of columns in a table , use tagname locator
		   //  Since here  the webpage has two tables , we use full xpath to find the no of columns and rows
			     
			List<WebElement> table= driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/th"));
			int size=table.size();
		     System.out.println("Web Table size : " + size);
			
			// To find the no if rows in a table 
			
			List<WebElement> tablerow=driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr"));
			System.out.println("Table Row Size :" + tablerow.size());
			
	 	// To get a data in a table
			WebElement data= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[5]/td[1]"));
			System.out.println(data.getText());
		  
		//PAGINATION TABLE
			
			driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input")).click();
			Thread.sleep(1000);

	// To find the total number of checkboxes in the pagination table 
	
	List <WebElement> total6=driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr"));
	int count6=total6.size();
	System.out.println("Total checkboxes in the Pagination Table :" + count6);
	
	
	      // To check for the Error Message Validation and find the colour  of the textbox
	
	   WebElement button, errormessage;
	   
	   button=driver.findElement(By.className("wikipedia-search-button"));
	   button.click();
	   Thread.sleep(1000);
	   
	   errormessage=driver.findElement(By.id("Wikipedia1_wikipedia-search-results"));
	   String errortext=errormessage.getText();
	   System.out.println("ERROR MESSAGE IS :" + errortext);
	   Thread.sleep(1000);
	   
	   //To get the text color of the error message 
			   
	      String txtcolor=errormessage.getCssValue("color");
	      System.out.println("Text mesasge color is :" + txtcolor);
	   
	/*   // NEW BROWSER WINDOW 
	      
	      WebElement nbwindow;
	   
	   nbwindow=  driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button"));
	   nbwindow.click();
	   
	   String text1=nbwindow.getText();
	   System.out.println(text1);
	   Thread.sleep(1000);
	   
	   //To switch to the main window
	   
	  driver.switchTo().window(currentURL);
	 
	
	       //To Find out the Number of Opened Windows

	        Set<String> allWindowHandles = driver.getWindowHandles();
	         ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
	          System.out.println("No. of tabs opened : " + tabs.size());
    */
       // ALERT BOXES
	  
	          WebElement alert,confirmbox,prompt;
	      
	         alert = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]"));
	  		alert.click();
           Thread.sleep(1500);
	  	
	  		Alert al=driver.switchTo().alert();  
	  	   Thread.sleep(2000);
	  		al.accept();
	  		
	  		confirmbox=driver.findElement(By.xpath(" //*[@id=\"HTML9\"]/div[1]/button[2]"));
	  		confirmbox.click();
	  		
           Alert but= driver.switchTo().alert();
	  		System.out.println(but.getText());  // print the text inside the box
	  		Thread.sleep(1000);
	  		but.dismiss();
	  		
	  		 prompt=driver.findElement(By.xpath(" //*[@id=\"HTML9\"]/div[1]/button[3]"));
	  		prompt.click();
	  		
	  		Alert pr= driver.switchTo().alert();
	  		System.out.println(pr.getText());
            pr.sendKeys("VISHNU") ;
	  		Thread.sleep(2000);
	  	 	pr.accept();
	  		
	  	 	//Double click
	  	 	
	  	 	WebElement doubleclick;
	  	 	doubleclick=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/h2"));
	  	 	
	  	 	Actions c=new Actions(driver);
	  	 	c.doubleClick().build().perform();
	  	 	Thread.sleep(2000);
	  	 	
	  	 	
	  	 	
	  		
	  // DRAG AND DROP
	  	 	
	  	 	WebElement drag , drop;
	  	 	
	  	 	drag=driver.findElement(By.id("draggable"));
	  	 	drop=driver.findElement(By.id("droppable"));
	  	 	
	  	 	Actions a= new Actions(driver);
	  	 	a.dragAndDrop(drag, drop).build().perform();
	          Thread.sleep(1000);
	          
	          //SLIDER
	          
	       WebElement slider;
	       
	       slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	       
	       Actions s= new Actions(driver);
	       s.dragAndDropBy(slider, 100, 125).perform();
	          
	          //copy from one field to other field using keydown action method
	       
	       WebElement field1,field2;
	       
	       field1=driver.findElement(By.id("field1"));
	          
	          Actions k=new Actions(driver);
	          Thread.sleep(2000);
	       // select and copy text
	          k.keyDown(field1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	          
	           field2=driver.findElement(By.id("field2"));
	          Thread.sleep(2000);
	           k.keyDown(field2, Keys.CONTROL).sendKeys("v").build().perform();
	          
	          
	          // FRAMES 
	           
	           WebElement frame;
	            frame=driver.findElement(By.xpath("//*[@id=\"FSForm\"]/div[2]"));
	           driver.switchTo().frame(frame);
	          
	       WebElement name1;
	       name1=driver.findElement(By.id("RESULT_TextField-0"));
	       name1.sendKeys("VISHNU AUTOMATION");
	          
	        System.out.println(name1.getAttribute("value"));
	        
	          
	          
	          
	          
	          
	  
	}

}
