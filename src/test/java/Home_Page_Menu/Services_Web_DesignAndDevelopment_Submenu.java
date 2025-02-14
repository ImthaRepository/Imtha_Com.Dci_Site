package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_Web_DesignAndDevelopment_Submenu extends Base_Class{
	
	@BeforeMethod
	public void URL_Call() {
		Url("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		mouseOver(locatorXpath("//li[@id='nav-menu-item-34292']//a[text()='Web Design & Development']"));
		info("MouseOver to Web Design & Development Submenu");
	}
	@Test (priority = 1)
	public void Web_Development_Menu() {
		clickJS(locatorXpath("//li[@id='nav-menu-item-1658']//a[text()='Web Development']"));
		info("Web Development Submenu clicked");
		WaitUntilVisibleTitle("Web Development Company, Website Design & Development Services");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Web Development Company, Website Design & Development Services";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Web Development Sub Menu Validated");
	 }
	
	@Test (priority = 2)
	public void UI_And_UX_Design_Menu() {
		clickJS(locatorXpath("//li[@id='nav-menu-item-13108']//a[text()='UI & UX Design']"));
		info("UI & UX Design Submenu clicked");
		WaitUntilVisibleTitle("Creative Web Design Agency, Responsive Website UI/UX Design Services");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Creative Web Design Agency, Responsive Website UI/UX Design Services";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/design/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("UI & UX Design Sub Menu Validated");
	 }
	
	@Test (priority = 3)
	public void Content_Management_System_Menu() {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34295']//a[text()='Content Management System']"));
		info("Content Management System Submenu clicked");
		WaitUntilVisibleTitle("CMS Development Agency, Custom CMS Website Design Services USA");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="CMS Development Agency, Custom CMS Website Design Services USA";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/cms/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Content Management System Sub Menu Validated");
	 }	

}
