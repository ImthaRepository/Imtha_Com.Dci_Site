package Home_Page_Menu;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import Base_Setup.Base_Code_Configuration;
import Utilities.Report_Generation_Final;


public class Base_Class extends Base_Code_Configuration{
	
  public Report_Generation_Final report;

 @Parameters("browser")
 @BeforeClass
	public void setup(String browser) {
		  
	    //String browser="chrome";
						
		if(browser.equalsIgnoreCase("chrome")){		
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {	
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {	
			 driver=new FirefoxDriver();
		}
		else {
			 System.out.println("No Such Browser Found. Try Again");
		}
				maximizeWindow();
				DeleteCookies();
				report=new Report_Generation_Final(); 	
	}


 @AfterClass
	public void tearDown() {	
	      closeAllWindows();
	}
		

}
