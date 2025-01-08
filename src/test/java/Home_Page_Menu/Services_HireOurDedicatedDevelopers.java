package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_HireOurDedicatedDevelopers extends Base_Class{
	@BeforeMethod
	public void URL_Call() {
		
		Url("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		mouseOver(locatorXpath("//li[@id='nav-menu-item-34285']//a[text()='Hire Our Dedicated Developers']"));
		info("Hire Our Dedicated Developers Submenu");
	}
	
	@Test(priority=1)
	public void Hire_Our_Android_Developer_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34286']//a[text()='Hire Our Android Developers']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Hire Android Developers, Dedicated Android App Development Team");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Hire Android Developers, Dedicated Android App Development Team";
		String ExpectedURL="https://www.dotcominfoway.com/hire-our-android-developers/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Hire Our Android Developer Sub Menu Validated");
	 }
	
	@Test(priority=2)
	public void Hire_Our_iOS_Developers_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34287']//a[text()='Hire Our iOS Developers']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Hire iOS Developers, Dedicated Offshore iPhone App Development Team");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Hire iOS Developers, Dedicated Offshore iPhone App Development Team";
		String ExpectedURL="https://www.dotcominfoway.com/hire-our-ios-developers/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Hire Our iOS Developers Sub Menu Validated");
	 }
	
	
	@Test(priority=3)
	public void Hire_Our_WordPress_Developers_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34288']//a[text()='Hire Our WordPress Developers']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Hire WordPress Developers, Best WordPress Developers");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Hire WordPress Developers, Best WordPress Developers";
		String ExpectedURL="https://www.dotcominfoway.com/hire-our-wordpress-developers/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Hire Our WordPress Developers Sub Menu Validated");
	 }
	
	
	@Test(priority=4)
	public void Hire_Our_PHP_Developers_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34289']//a[text()='Hire Our PHP Developers']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Hire PHP Developers, Dedicated Offshore Team, Remote PHP Developers");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Hire PHP Developers, Dedicated Offshore Team, Remote PHP Developers";
		String ExpectedURL="https://www.dotcominfoway.com/hire-our-php-developers/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Hire Our PHP Developers Sub Menu Validated");
	 }
	
	
	@Test(priority=5)
	public void Hire_Our_DotNET_Developers_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34290']//a[text()='Hire Our .NET Developers']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Hire Dot Net Developers, Dedicated .NET Developers, Offshore Team");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Hire Dot Net Developers, Dedicated .NET Developers, Offshore Team";
		String ExpectedURL="https://www.dotcominfoway.com/hire-our-net-developers/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Hire Our .NET Developers Sub Menu Validated");
	 }
	
	
	
}
