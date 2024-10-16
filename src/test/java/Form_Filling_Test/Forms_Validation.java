package Form_Filling_Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Home_Page_Menu.Base_Class;

public class Forms_Validation extends Base_Class{
	
@BeforeMethod
public void URL_Call() {
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
}
	
@Test(priority=1)
public void ContactForm() throws InterruptedException {
    click(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Contact']"));
    sleep(1000);
//Name	
	    sendKeys(locatorXpath("//input[@id='wpforms-49671-field_1']"), "Imtha Tester");
	    info("Name Field Validated");

//Email
	    sendKeys(locatorXpath("//input[@id='wpforms-49671-field_3']"), "Tesing@ymail.com");
	    info("Email Field Validated");
	    
//Company Name
	    sendKeys(locatorXpath("//input[@id='wpforms-49671-field_11']"),"Dot Com Infoway");
		info("Company Name Validated");
		
//Phone Number	
    sendKeys(locatorXpath("//input[@id='wpforms-49671-field_8']"), "9677871606");
	 
 
//Select interested
		forLoop(multipleelements("//select[@id='wpforms-49671-field_7']//option"),"//select[@id='wpforms-49671-field_7']//option", 2, 500);
		info("Select Interest is Validated");
		sleep(1000);

//Select Budget	
	    forLoop(multipleelements("//select[@id='wpforms-49671-field_9']//option"),"//select[@id='wpforms-49671-field_9']//option", 2, 500);
	    info("Budget Field is Validated");
	
//Requirement Text field
	    sendKeys(locatorId("wpforms-49671-field_10"), "This message is for Testing purpose .So Kindly Ignore this Message");
	    info("Requirement Field is validated");
	   
//submit Button
	  /*  click(locatorXpath("//button[@id='wpforms-submit-49671']"));
	    info("Submit button clicked");*/
	    
	    info("Contact form Validated");
}

@Test(priority=2)
public void GetQuoteForm() throws InterruptedException {
    sleep(1000);
    click(locatorId("header-request-quote"));
    switchWindow();
    sleep(1000);
    
//Name	
sendKeys(locatorId("wpforms-49671-field_1"),"Imtha Tester" );
info("Name Field Validated");

//Email
sendKeys(locatorXpath("//input[@id='wpforms-49671-field_3']"), "Tesing@ymail.com");
info("Email Field Validated");

//Company Name
sendKeys(locatorId("wpforms-49671-field_11"), "Dot Com Infoway");
info("Company Name Field Validated");
	
//Phone Number	
sendKeys(locatorId("wpforms-49671-field_8"), "9677871606");
Thread.sleep(1000);

//Select interested
forLoop(multipleelements("//select[@id='wpforms-49671-field_7']//option"), "//select[@id='wpforms-49671-field_7']//option", 2, 500);
info("Select Interest is Validated");
forLoop(multipleelements("//select[@id='wpforms-49671-field_9']//option"), "//select[@id='wpforms-49671-field_9']//option", 2, 500);
info("Budget Field is Validated");

//Reqrirement Text field
 sendKeys(locatorId("wpforms-49671-field_10"), "This message is for Testing purpose .So Kindly Ignore this Message");
 info("Requirement Field is validated");

//Submit Button
/* click(locatorXpath("//button[@id='wpforms-submit-49671']"));
 info("submit Button clicked");*/
// closeCurrentwindow();
 switchWindow();
 info("Get Quote Form Validated");	 

}

@Test(priority=3)
public void QuickConsultationForm() throws InterruptedException {
    MouseOverJS(locatorId("wpforms-49667-field_10"));
    sleep(1000);

//Name	
    sendKeys(locatorId("wpforms-49667-field_1"), "Imtha Tester");
    info("Name Field Validated");

//Email
    sendKeys(locatorXpath("//input[@id='wpforms-49667-field_3']"), "Tesing@ymail.com");
    info("Email Field Validated");
 
//Select interested
	forLoop(multipleelements("//select[@id='wpforms-49667-field_7']//option"),"//select[@id='wpforms-49667-field_7']//option", 2, 500);
	info("Select Interest is Validated");
	
//Phone Number	
    sendKeys(locatorId("wpforms-49667-field_8"), "9677871606");
    sleep(1000);

//Select Budget	
    forLoop(multipleelements("//select[@id='wpforms-49667-field_9']//option"),"//select[@id='wpforms-49667-field_9']//option", 2, 500);
    info("Budget Field is Validated");

//Requirement Text field
    sendKeys(locatorId("wpforms-49667-field_10"), "This message is for Testing purpose .So Kindly Ignore this Message");
    info("Requirement Field is validated");
    
//submit Button
    /*click(locatorXpath("//button[@id='wpforms-submit-49667']"));
    info("submit button clicked");*/
    
    info("Quick Consultation form Validated");
    
}

@Test(priority=4)
public void JobApplicationForm() throws InterruptedException, AWTException {
	sleep(2000);
    clickJS(locatorXpath("//a[text()='Apply Here']"));
    info("Job Application Menu clicked");
    sleep(3000);

	switchWindow();
	
//Name	
	       sendKeys(locatorId("wpforms-50096-field_1"), "Imtha Tester");
           info("Name Field Validated");
 
//Email
	       sendKeys(locatorXpath("//input[@id='wpforms-50096-field_2']"), "Tesing@ymail.com");
	       info("Email Field Validated");
  
//Phone Number	
	        sendKeys(locatorId("wpforms-50096-field_3"), "9677871606");
            sleep(1000);
            info("phone number field validated");
//Select Post
		    forLoop(multipleelements("//select[@id='wpforms-50096-field_4']//option"), "//select[@id='wpforms-50096-field_4']//option", 2, 200);
	        info("Select Post is Validated");
  
//Select Location
	        forLoop(multipleelements("//select[@id='wpforms-50096-field_5']//option"), "//select[@id='wpforms-50096-field_5']//option", 2, 500);
	        info("Location Field is Validated");
	    
//Select Search Engine
	         forLoop(multipleelements("//select[@id='wpforms-50096-field_6']//option"), "//select[@id='wpforms-50096-field_6']//option", 2, 300);
		     info("Search Engine Field is Validated");
		  
//Gender Selection
		     click(locatorXpath("//input[@id='wpforms-50096-field_7_1']"));
		     sleep(500);
		     click(locatorXpath("//input[@id='wpforms-50096-field_7_2']"));
		     sleep(500);
		     click(locatorXpath("//input[@id='wpforms-50096-field_7_1']"));
		     info("Gender Field Vaidated");

//Select Year of Experience    
		     forLoop(multipleelements("//select[@id='wpforms-50096-field_8']//option"), "//select[@id='wpforms-50096-field_8']//option", 2, 100);
			 info("Year of Experience Field is Validated");
			  
//Select Month of Experience   		
			 forLoop(multipleelements("//select[@id='wpforms-50096-field_9']//option"), "//select[@id='wpforms-50096-field_9']//option", 2, 100);
			 info("Month of experience Field is Validated");	
					       				       
//Highest QualificationText field
	        sendKeys(locatorXpath("//input[@id='wpforms-50096-field_10']"), "Test Engineer");
	        info("Highest Qualification field is validated");

//Key Skills field		    
	        sendKeys(locatorXpath("//textarea[@id='wpforms-50096-field_11']"), "This message is for Testing purpose only.So Kindly Ignore this Message");
	        info("Key Skills field is validated");

//Current Designation field     
	        sendKeys(locatorXpath("//input[@id='wpforms-50096-field_12']"), "Tester");
	        info("Current Designation field is validated");
	
//Current Location field	    
		    sendKeys(locatorXpath("//input[@id='wpforms-50096-field_13']"), "Madurai");
		    info("Current Location Field is validated");
		    
//Upload Resume
		 /*   uploadFile(locatorXpath("//div[@class='dz-message']"),"C:\\Users\\Ram prathees\\Downloads\\CV.pdf" );
		    info("Resume Uploaded");*/
		    
//Send Button
		   /* click(locatorXpath("//button[@id='wpforms-submit-50096']"));
		    info("Send Button Clicked");*/
		   
		    info("Job Allication Form Validated");
		    switchWindow();
}

@Test(priority=5)
public void SendMessageForm() throws InterruptedException {

    mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    WaitUntilVisibleLocator("//div[@class='widget-visible']");
    mouseOver(locatorXpath("//div[@class='widget-visible']"));
    switchToframeElement(locatorXpath("(//iframe[@title='chat widget'])[1]"));
    try {
  	  click(locatorXpath("//div[text()=' Send message ']"));
        info("Send Message is Clicked");
	      } catch (Exception e) 
        {
	    	  click(locatorXpath("//div[text()=' Online ']"));
	          info("Online is Clicked");
	      }

    switchToDefaultFrame();
    mouseOver(locatorXpath("//div[@class='widget-visible']"));
    info("Moved to Home Element");
    switchToframeElement(locatorXpath("(//iframe[@title='chat widget'])[2]"));
    
//Name Field
    sendKeys(locatorXpath("//input[@name='name']"), "Imtha Tester");
    info("Name Field Validated");

//Email Field
     sendKeys(locatorXpath("//input[@name='email']"), "Tester@ymail.com");
     info("Email Field Validated");

//phone field 
    sendKeys(locatorXpath("//input[@name='tel']"), "9677871606");
    info("Phone Field Validated");

//Interested Services
    try {
    	 mouseOver(locatorXpath("//textarea[@aria-placeholder='Requirement']"));
	} catch (Exception e) {
		ScrollJS(0, 100);
	}
   
    try {
  	  forLoop(multipleelements("//label[@class='tawk-checkbox-container']"), "//label[@class='tawk-checkbox-container']", 1, 200);
  	  info("Interested service validated");
    } catch (Exception e) {
		  e.printStackTrace();
		  info("Interested service validation Failure");
	    }
//Message Field
    try {
  	  sendKeys(locatorXpath("//textarea[@aria-placeholder='Message']"), "This message is for Testing purpose .So Kindly Ignore this Message");
      info("Message field Validated");
	  } catch (Exception e) {
		sendKeys(locatorXpath("//textarea[@aria-placeholder='Requirement']"), "This message is for Testing purpose .So Kindly Ignore this Message");
        info("Requirement field Validated");
	    }
 

//Submit Button
 /* try {
      click(locatorXpath("//button//p[text()=' Submit ']"));
      info("submit button clicked");
	} catch (Exception e) {
		 click(locatorXpath("//button//p[text()=' Start Chat ']"));
         info("submit button clicked");
	}*/
    

//Close the Frame
    click(locatorXpath("(//button[@data-text='Minimize'])[1]"));
    info("Frame Closer Vaidated");
    info("Send Message form Validated");
}

@Test(priority=6)
public void Vendor_Form_Filling() throws InterruptedException {
	 
    mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='About Us']"));
    clickJS(locatorXpath("//li[@id='accordion-menu-item-25204']//a[text()='Vendor Registration']"));
    info("Submenu clicked");
    sleep(2000);

//Name of the company	
 sendKeys(locatorId("wpforms-49913-field_1"), "Imtha Tester");
    info("Name of the company Field Validated");

//Number of Employees

		forLoop(multipleelements("//select[@id='wpforms-49913-field_22']//option"), "//select[@id='wpforms-49913-field_22']//option", 2, 400);
     info("Number of employees is Validated");

//Company Type
  
     forLoop(multipleelements("//select[@id='wpforms-49913-field_26']//option"), "//select[@id='wpforms-49913-field_26']//option", 2, 500);
     info("Company Type is Validated");
 
//Industry Experience

   forLoop(multipleelements("//select[@id='wpforms-49913-field_27']//option"), "//select[@id='wpforms-49913-field_27']//option", 2, 500);
	  info("Industry Experience Field is Validated");
	  ScrollJS(0, 150);
	  
//Tech Expertise

	   forLoop(multipleelements("//ul[@id='wpforms-49913-field_28']//li//input"), "//ul[@id='wpforms-49913-field_28']//li//input", 1, 200);
	   forLoop(multipleelements("//ul[@id='wpforms-49913-field_28']//li//input"), "//ul[@id='wpforms-49913-field_28']//li//input", 1, 200);
	
	   info("TEch Expertise is Validated");
	    
//TaX ID Field
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_30']"), "TesT123456");
	    info("Tax ID Field Validated");
 
//Registration Number	
	    sendKeys(locatorId("wpforms-49913-field_31"), "TEST9677871606");
     sleep(1000);
     info("Registration Number Field Validated");
     
//Address
     sendKeys(locatorXpath("//input[@id='wpforms-49913-field_33']"), "NO.1,DCI complex, Tester, Madurai-625020");
	    info("Address Field Validated");
	    
	    
//City
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_34']"), "Anna Nagar");
	    info("City Field Validated");
	    
//Website Field
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_36']"), "www.DCI.in");
	    info("Website Field Validated");
	    
//Portfolio URL Field
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_37']"), "www.DCI.com/Tester");
	    info("Portfolio URL Field Validated");
	    
//Name of the Contact person
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_39']"), "Imtha");
	    info("Name of the Contact person Field Validated");
	    
//Job Title of contact person
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_40']"), "Tester");
	    info("Job title of contact person Field Validated");
	    
	    /*ScrollJS(0, 150);
//Country code(Contact Number)
	    click(locatorXpath("//div[@class='iti__flag-container']"));
	    sleep(1000);	
	    forLoop(multipleelements("//ul[@id='iti-0__country-listbox']//li"), "//ul[@id='iti-0__country-listbox']//li", 4, 10);
	    info("Countries code Selection is Validated");
	    sleep(2000);*/
	    
//Contact Number
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_8']"), "9677871606");
	    info("Contact Number Field Validated");
	    
//Whatsapp nember or Skype ID
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_42']"), "9677871606");
	    info("Whatsapp  Field Validated");
	    
//Email Field
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_3']"), "TesTer@yopmail.com");
	    info("Email field Field Validated");
	    
//Bank Details/pay Pal ID
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_44']"), "TesT123456");
	    info("Bank Details Field Validated");
	    
//Any Relevant Certificate 
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_45']"), "TesT1234");
	    info("Any Relevant Certificate Field Validated");
	    
//Decision Maker Name
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_47']"), "Tester");
	    info("Decision Maker Field Validated");
	    
//Decision maker Email
	    sendKeys(locatorXpath("//input[@id='wpforms-49913-field_49']"), "TesT123456@ymail.com");
		info("Decision maker Email Field Validated");
	    		   		 
//Brief Description about the company
	    sendKeys(locatorXpath("//textarea[@id='wpforms-49913-field_50']"), "This message is for Testing purpose.So Kindly Ignore this Message");
	    info("Brief Description about the company Field Validated");
	   
//submit button
	   /* click(locatorXpath("//button[@id='wpforms-submit-49913']"));
	    info("submit Button clicked");*/

	    info("Vendor Registration form Validated");
	  
}

}
