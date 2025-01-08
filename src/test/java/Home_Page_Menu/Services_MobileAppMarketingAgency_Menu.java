package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_MobileAppMarketingAgency_Menu extends Base_Class{
	
	@BeforeMethod
	public void URL_Call() {
		
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		MouseOverJS(locatorXpath("//li[@id='accordion-menu-item-13041']//a[text()='Mobile App Marketing Agency']"));
		info("Mousehover to the Mobile App Marketing Agency Submenu");
	}
	
	@Test(priority=1)
	public void App_Store_Optimization_Services_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-56645']//a[text()='App Store Optimization Services']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile App Marketing Agency, ASO, User Acquisition Services";
		String ExpectedURL="https://www.dotcominfoway.com/app-store-optimization-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("App Store Optimization Services Sub Menu Validated");
	 }
	
	@Test(priority=2)
	public void Localization_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-52482']//a[text()='Localization']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Ecommerce Mobile App Development Agency,Top Ecommerce Developers";
		String ExpectedURL="https://www.dotcominfoway.com/aso-localization-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Localization Sub Menu Validated");
	 }
	
	@Test(priority=3)
	public void User_Engagement_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-52490']//a[text()='User Engagement']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile App User Engagement Services, Boost App Retention & Conversion";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-app-user-engagement/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("User Engagement Sub Menu Validated");
	 }
	
	@Test(priority=4)
	public void Android_Apps_Marketing_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34270']//a[text()='Android Apps Marketing']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Best Android App Marketing Services, Top Mobile App Promotion Agency";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/mobile-apps-marketing/android/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Android Apps Marketing Sub Menu Validated");
	 }
	
	@Test(priority=5)
	public void iPhone_Apps_Marketing_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34278']//a[text()='iPhone Apps Marketing']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Award Winning iPhone App Marketing Agency,iOS App Promotion Services";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/mobile-apps-marketing/iphone/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("iPhone Apps Marketing Sub Menu Validated");
	 }
	
	@Test(priority=6)
	public void Free_Consulations_Service_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-51125']//a[text()='Free Consulations Service']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Free App Marketing Consultation Service";
		String ExpectedURL="https://www.dotcominfoway.com/free-consultation-service/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Free Consulations Service Sub Menu Validated");
	 }
	
	@Test(priority=7)
	public void Mobile_App_Ads_Campaign_Management_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34282']//a[text()='Mobile App Ads Campaign Management']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile App Ads Campaign Management, Best Mobile Advertising Agency";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-app-ads-campaign-management/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile App Ads Campaign Management Sub Menu Validated");
	 }
	
	@Test(priority=8)
	public void Mobile_Games_Marketing_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-37723']//a[text()='Mobile Games Marketing']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile Game Marketing Agency, Best Game Marketing Company";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-game-marketing-agency/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile Games Marketing Sub Menu Validated");
	 }
	
	@Test(priority=9)
	public void Mobile_Pre_Launch_Activities_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34274']//a[text()='Mobile Pre Launch Activities']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="App Pre Launch Activities, Mobile App Launch Campaign Ideas,";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-pre-launch-activities/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile Pre Launch Activities Sub Menu Validated");
	 }
	
	@Test(priority=10)
	public void Mobile_App_Market_Research_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34275']//a[text()='Mobile App Market Research']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile App Market Research Services, Best Market Research Company";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-app-market-research/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile App Market Research Sub Menu Validated");
	 }
	
	@Test(priority=11)
	public void Mobile_App_Growth_Marketing_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34276']//a[text()='Mobile App Growth Marketing']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile App Growth Marketing Services, Speed-up App Growth";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-app-growth-marketing/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile App Growth Marketing Sub Menu Validated");
	 }
	
	@Test(priority=12)
	public void Mobile_App_Prototype_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34277']//a[text()='Mobile App Prototype']"));
		info("Submenu clicked");
		sleep(1500);
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="UI/UX Mobile Application Design Company, Mobile App Prototyping";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-app-prototyping/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile App Prototype Sub Menu Validated");
	 }

}
