package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_MobileAppDevelopmentMenu  extends Base_Class{
	@BeforeMethod
	public void URL_Call() {
		
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		mouseOver(locatorXpath("//li[@id='nav-menu-item-18624']//a[text()='Mobile Apps Development']"));
		info("Mousehover to the Mobile App development Submenu");
	}
	
	@Test(priority=1)
	public void Android_App_Development_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34250']//a[text()='Android App Development']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Top Android App Development Agency,Hire Android Application Developers");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Top Android App Development Agency,Hire Android Application Developers";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/android-app-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Android App Development Sub Menu Validated");
	 }
	
	@Test(priority=2)
	 public void Enterprise_Mobile_Application_Development_SubMenu()  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-41145']//a[text()='Enterprise Mobile Application Development']"));
		info("Submenu clicked");
		WaitUntilVisibleLocator("//h1[text()='Enterprise Mobile App Development']");
		String ActualPageTitle=getText(locatorXpath("//h1[text()='Enterprise Mobile App Development']"));
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Top Enterprise App Development Company Services - Dot Com Infoway";
		String ExpectedPageTitle="Enterprise Mobile App Development";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/enterprise-mobile-application-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		Assert(ActualPageTitle, ExpectedPageTitle);
		info("Enterprise Mobile Application Development Sub Menu Validated");
	 }

	@Test(priority=3)
	 public void Startup_App_Development_SubMenu()  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34508']//a[text()='Startup App Development']"));
		info("Submenu clicked");
		WaitUntilVisibleLocator("//h1[text()='Startup App Development Company - Your Startup Growth Partner']");
		String ActualPageTitle=getText(locatorXpath("//h1[text()='Startup App Development Company - Your Startup Growth Partner']"));
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Startup App Development Company, Mobile App Developers for Startups";
		String ExpectedPageTitle="Startup App Development Company - Your Startup Growth Partner";
		String ExpectedURL="https://www.dotcominfoway.com/startup-app-development-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		Assert(ActualPageTitle, ExpectedPageTitle);
		info("Startup App Development Sub Menu Validated");
	 }

	@Test(priority=4)
	 public void iOS_App_Developmentt_SubMenu()  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34252']//a[text()='iOS App Development']"));
		info("Submenu clicked");
		WaitUntilVisibleLocator("//h2[text()='Our iPhone App Development Services']");
		String ActualPageTitle=getText(locatorXpath("//h2[text()='Our iPhone App Development Services']"));
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedPageTitle="Our iPhone App Development Services";
		String ExpectedTitle="iOS App Development Agency USA-Custom iPhone Application Developers";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/ios-app-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		Assert(ActualPageTitle, ExpectedPageTitle);
		info("iOS App Development Sub Menu Validated");
	 }
	
	@Test(priority=5) 
	 public void Blockchain_Development_SubMenu()  {
	 	clickJS(locatorXpath("//li[@id='nav-menu-item-34306']//a[text()='Blockchain Development']"));
	 	info("Submenu clicked");
	 	WaitUntilVisibleTitle("Blockchain Application Development Company, Ethereum App Development Services, Blockchain App Developers - Dot Com Infoway");
	 	String ActualURL=getUrl();
	 	String ActualTitle=getTitle();
	 	String ExpectedTitle="Blockchain Application Development Company, Ethereum App Development Services, Blockchain App Developers - Dot Com Infoway";
	 	String ExpectedURL="https://www.dotcominfoway.com/blockchain-development/";
	 	Assert(ActualTitle, ExpectedTitle);
	 	Assert(ActualURL, ExpectedURL);
	 	info("Blockchain Development Sub Menu Validated");
	 }
/*	
	@Test(priority=5) 
	 public void iPad_App_Development_SubMenu()  {
	 	clickJS(locatorXpath("//li[@id='nav-menu-item-34253']//a[text()='iPad App Development']"));
	 	info("Submenu clicked");
	 	WaitUntilVisibleLocator("//h1[text()='iPad App Development']");
	 	String ActualPageTitle=getText(locatorXpath("//h1[text()='iPad App Development']"));
	 	String ActualURL=getUrl();
	 	String ActualTitle=getTitle();
	 	String ExpectedPageTitle="iPad App Development";
	 	String ExpectedTitle="iPad App Development Company, iPad App Development Services - Dot Com Infoway";
	 	String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/ipad/";
	 	Assert(ActualTitle, ExpectedTitle);
	 	Assert(ActualURL, ExpectedURL);
	 	Assert(ActualPageTitle, ExpectedPageTitle);
	 	info("iPad App Development Sub Menu Validated");
	 }
	 
	@Test(priority=6)
	public void HTML5_Development_SubMenu()  {
	 	clickJS(locatorXpath("//li[@id='nav-menu-item-34254']//a[text()='HTML5 Development']"));
	 	info("Submenu clicked");
	 	WaitUntilVisibleLocator("//h1[text()='HTML5 Development']");
	 	String ActualPageTitle=getText(locatorXpath("//h1[text()='HTML5 Development']"));
	 	String ActualURL=getUrl();
	 	String ActualTitle=getTitle();
	 	String ExpectedTitle="HTML5 Mobile App Development Services, Expert HTML5 Developers - Dot Com Infoway";
	 	String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/html-5/";
	 	String ExpectedPageTitle="HTML5 Development";
	 	Assert(ActualTitle, ExpectedTitle);
	 	Assert(ActualURL, ExpectedURL);
	 	Assert(ActualPageTitle, ExpectedPageTitle);
	 	info("HTML5 Development Sub Menu Validated");
	 }
	 
	@Test(priority=7)
	public void Windows_Application_Development_SubMenu()  {
	 	clickJS(locatorXpath("//li[@id='nav-menu-item-34255']//a[text()='Windows Application Development']"));
	 	info("Submenu clicked");
	 	WaitUntilVisibleLocator("//h1[text()='Windows Application Development']");
	 	String ActualPageTitle=getText(locatorXpath("//h1[text()='Windows Application Development']"));
	 	String ActualURL=getUrl();
	 	String ActualTitle=getTitle();
	 	String ExpectedTitle="Windows App Development Services, Expert Windows 10 App Developers - Dot Com Infoway";
	 	String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/windows/";
	 	String ExpectedPageTitle="Windows Application Development";
	 	Assert(ActualTitle, ExpectedTitle);
	 	Assert(ActualURL, ExpectedURL);
	 	Assert(ActualPageTitle, ExpectedPageTitle);
	 	info("Windows Application Development Sub Menu Validated");
	 }
*/
}

