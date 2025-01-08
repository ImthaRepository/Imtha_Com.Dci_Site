package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_BusinessConsultingServices extends Base_Class {

	@BeforeMethod
	public void URL_Call() {
		
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		mouseOver(locatorXpath("//li[@id='nav-menu-item-34302']//a[text()='Business Consulting Services']"));
		info("Mousehover to the Business Consulting Services Submenu");
	}
	
	@Test(priority=1)
	public void Mobile_App_Business_Consultation_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34303']//a[text()='Mobile App Business Consultation']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Mobile App Consulting Services, Top Mobile App Development Consultants");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile App Consulting Services, Top Mobile App Development Consultants";
		String ExpectedURL="https://www.dotcominfoway.com/business-consulting-services/mobile-app/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile App Business Consultation Sub Menu Validated");
	 }
}
