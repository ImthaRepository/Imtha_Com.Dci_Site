package Home_Page_Menu;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Header_Services_Submenu extends Base_Class {
	
	
@BeforeMethod
	public void URL_Call() {
		
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
	}

@Test (priority=1)
public void Mobile_App_Development_SubMenu()  {
	clickJS(locatorXpath("//li[@id='nav-menu-item-18624']//a[text()='Mobile Apps Development']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h1[text()='Mobile App Development Agency']");
	String ActualPageTitle=getText(locatorXpath("//h1[text()='Mobile App Development Agency']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Mobile App Development Agency, App Development Company - DCI";
	String ExpectedPageTitle="Mobile App Development Agency";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Mobile App Development Sub Menu Validated");
}


@Test (priority=2)
public void Digital_Marketing_SubMenu() {
	clickJS(locatorXpath("//li[@id='nav-menu-item-13050']//a[text()='Digital Marketing']"));
	info("Submenu clicked");
	WaitUntilVisibleTitle(("Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("Digital Marketing Sub Menu Validated");
	}

@Test (priority=3)
public void Mobile_App_Marketing_Agency_SubMenu() {
	clickJS(locatorXpath("//li[@id='nav-menu-item-13041']//a[text()='Mobile App Marketing Agency']"));
	info("Submenu clicked");
	WaitUntilVisibleTitle("Mobile App Marketing Agency, ASO, User Acquisition Services");
	String ActualTitle=getTitle();
	String ExpectedTitle="Mobile App Marketing Agency, ASO, User Acquisition Services";
	Assert(ActualTitle, ExpectedTitle);
	info("Mobile App Marketing Agency Sub Menu Validated");
	}

@Test (priority=4)
public void Hire_Our_Dedicated_Developers_SubMenu() {
	clickJS(locatorXpath("//li[@id='nav-menu-item-34285']//a[text()='Hire Our Dedicated Developers']"));
    info("Submenu clicked");
    WaitUntilVisibleLocator("//h1[text()='Hire Our Dedicated Developers']");
	String ActualPageTitle=getText(locatorXpath("//h1[text()='Hire Our Dedicated Developers']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Hire Dedicated Developers, Remote Web & Mobile App Developers";
	String ExpectedPageTitle="Hire Our Dedicated Developers";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Hire Our Didicated Developers Sub Menu Validated");
	}

@Test (priority=5)
public void Web_Design_And_Development_SubMenu()  {
	clickJS(locatorXpath("//li[@id='nav-menu-item-34292']//a[text()='Web Design & Development']"));
    info("Submenu clicked");
	info("Web Design and Development Sub Menu Not Clickable");
	}

@Test (priority=6)
public void Business_Consulting_Services_SubMenu() {
	clickJS(locatorXpath("//li[@id='nav-menu-item-34302']//a[text()='Business Consulting Services']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Business Consulting Services']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Business Consulting Services']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="End-to-End Business Consulting Services, Small Business Consulting Firm";
	String ExpectedPageTitle="Business Consulting Services";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Business Consulting Services Sub Menu Validated");
	}

@Test (priority=7)
public void AI_Services_SubMenu() {
	clickJS(locatorXpath("//li[@id='nav-menu-item-46750']//a[text()='AI Services']"));
	info("Submenu clicked");
	WaitUntilVisibleTitle("AI Services, Artificial Intelligence Solutions - Dot Com Infoway");
	String ActualTitle=getTitle();
	String ExpectedTitle="AI Services, Artificial Intelligence Solutions - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("AI Services Sub Menu Validated");
	}

@Test (priority=8)
public void GIS_Services_SubMenu()  {
	clickJS(locatorXpath("//li[@id='nav-menu-item-55343']//a[text()='GIS Services']"));
	info("Submenu clicked");
	WaitUntilVisibleTitle("Industry-Leading GIS Services for Business Insights");
	String ActualTitle=getTitle();
	String ExpectedTitle="Industry-Leading GIS Services for Business Insights";
	String AcutualUrl=getUrl();
	String ExpectedUrl="https://www.dotcominfoway.com/gis-services/";
	Assert(AcutualUrl, ExpectedUrl);
	Assert(ActualTitle, ExpectedTitle);
	info("GIS Services Sub Menu Validated");
	}
/*
@Test (priority=8)
public void Wallet_Integration_Service_SubMenu()  {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-34305']//a[text()='Wallet Integration Service']"));
	info("Submenu clicked");
	WaitUntilVisibleTitle("Digital Wallet Integration Services, Payment Gateway Integration");
	String ActualTitle=getTitle();
	String ExpectedTitle="Digital Wallet Integration Services, Payment Gateway Integration";
	Assert(ActualTitle, ExpectedTitle);
	info("Wallet Integration Service Sub Menu Validated");
	}

@Test (priority=9)
public void Blockchain_Development_SubMenu() {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-34306']//a[text()='Blockchain Development']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h2[text()='Our Blockchain App Development Services']");
	String ActualPageTitle=getText(locatorXpath("//h2[text()='Our Blockchain App Development Services']"));
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Blockchain Application Development Company, Ethereum App Development Services, Blockchain App Developers - Dot Com Infoway";
	String ExpectedPageTitle="Our Blockchain App Development Services";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Blockchain Development Sub Menu Validated");
	}

@Test (priority=10)
public void Managed_Services_SubMenu()  {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-34307']//a[text()='Managed Services']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h1[text()='We Manage Your Server so That You Can Manage Your Business.']");
	String ActualPageTitle=getText(locatorXpath("//h1[text()='We Manage Your Server so That You Can Manage Your Business.']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Cloud Server Management Services,Managed IT Server Support Company";
	String ExpectedPageTitle="We Manage Your Server so That You Can Manage Your Business.";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Managed Services Sub Menu Validated");
    }
*/

}
