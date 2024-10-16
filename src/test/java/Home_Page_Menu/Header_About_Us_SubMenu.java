package Home_Page_Menu;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Header_About_Us_SubMenu extends Base_Class {

@BeforeMethod
	public void URL_Call() {
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
	}

@Test(priority=1)
public void Company_Fact_File_SubMenu()  {
	
	clickJS(locatorXpath("//li[@id='accordion-menu-item-16941']//a[text()='Company Fact File']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Company Fact File']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Company Fact File']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Company Fact File - Dot Com Infoway";
	String ExpectedPageTitle="Company Fact File";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Company Fact File Sub Menu Validated");
}

@Test(priority=2)
public void Meet_the_Team_SubMenu()  {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-17570']//a[text()='Meet the Team']"));
	info("Submenu clicked");
	WaitUntilVisibleTitle("Meet the Team - Dot Com Infoway");
	String ActualTitle=getTitle();
	String ExpectedTitle="Meet the Team - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
    info("Meet the Team Sub Menu Validated");
}

@Test(priority=3)
public void Our_Clients_SubMenu()  {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-13855']//a[text()='Our Clients']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Our Clients']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Our Clients']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Clients - Dot Com Infoway";
	String ExpectedPageTitle="Our Clients";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Our Clients Sub Menu Validated");
}

@Test(priority=4)
public void Products_SubMenu()  {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-48397']//a[text()='Products']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h2[text()='Products']");
	String ActualPageTitle=getText(locatorXpath("//h2[text()='Products']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Products Dot Com Infoway";
	String ExpectedPageTitle="Products";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Products Sub Menu Validated");
}

@Test(priority=5)
public void Become_Our_Representative_SubMenu()  {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-43959']//a[text()='Become Our Representative']"));
	info("Submenu clicked");
	WaitUntilVisibleTitle("Become Our Representative - Dot Com Infoway");
	String ActualTitle=getTitle();
	String ExpectedTitle="Become Our Representative - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("Become Our Representative Sub Menu Validated");
}

@Test(priority=6)
public void Business_Models_SubMenu() {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-13186']//a[text()='Business Models']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Business Model']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Business Model']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Our Business Model";
	String ExpectedPageTitle="Business Model";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Business Models Sub Menu Validated");
}

@Test(priority=7)
public void Awards_SubMenu()  {

	clickJS(locatorXpath("//li[@id='accordion-menu-item-13386']//a[text()='Awards']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Awards']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Awards']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Dot Com Infoway - Awards";
	String ExpectedPageTitle="Awards";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
    info("Awards Sub Menu Validated");
}

@Test(priority=8)
public void Partner_With_Us_SubMenu()  {
	
	clickJS(locatorXpath("//li[@id='accordion-menu-item-24615']//a[text()='Partner With Us']"));
    info("Submenu clicked");
    WaitUntilVisibleTitle("IT Business Partnership, Business Opportunity in App & Web Development Services, Referral Service Business - Dot Com Infoway");
	String ActualTitle=getTitle();
	String ExpectedTitle="IT Business Partnership, Business Opportunity in App & Web Development Services, Referral Service Business - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("Partner With Us Sub Menu Validated");
}

@Test(priority=9)
public void Testimonials_SubMenu()  {
	
	clickJS(locatorXpath("//li[@id='accordion-menu-item-31560']//a[text()='Testimonials']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Testimonials']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Testimonials']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Testimonials - Dot Com Infoway";
	String ExpectedPageTitle="Testimonials";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Testimonials Sub Menu Validated");
}

@Test(priority=10)
public void Vendor_Registration_SubMenu()  {
	
	clickJS(locatorXpath("//li[@id='accordion-menu-item-25204']//a[text()='Vendor Registration']"));
    info("Submenu clicked");
    WaitUntilVisibleTitle("Vendor Registration Form - Dot Com Infoway");
	String ActualTitle=getTitle();
	String ExpectedTitle="Vendor Registration Form - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("Vendor Registration Sub Menu Validated");
}

@Test(priority=11)
public void Technologies_SubMenu()  {
	clickJS(locatorXpath("//li[@id='accordion-menu-item-25896']//a[text()='Technologies']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h2[text()='Our Technologies']");
	String ActualPageTitle=getText(locatorXpath("//h2[text()='Our Technologies']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Technologies We Use, Web & Mobile App Tech Stacks, UI/UX & Testing Tools - Dot Com Infoway";
	String ExpectedPageTitle="Our Technologies";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Technologies Sub Menu Validated");
}

@Test(priority=12)
public void Methodology_SubMenu()  {
	
	clickJS(locatorXpath("//li[@id='accordion-menu-item-13187']//a[text()='Methodology']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Methodology']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Methodology']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Methodology";
	String ExpectedPageTitle="Methodology";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Methodology Sub Menu Validated");
}

@Test(priority=13)
public void Alliances_SubMenu() {

	clickJS(locatorXpath("//li[@id='accordion-menu-item-13137']//a[text()='Alliances']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Alliances']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Alliances']"));
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Alliances of Dot Com Infoway";
	String ExpectedPageTitle="Alliances";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Alliances Sub Menu Validated");
}

@Test(priority=14)
public void Infrastructure_SubMenu() {

	clickJS(locatorXpath("//li[@id='accordion-menu-item-13141']//a[text()='Infrastructure']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Infrastructure']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Infrastructure']"));
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Infrastructure - Dot Com Infoway";
	String ExpectedPageTitle="Infrastructure";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Infrastructure Sub Menu Validated");
}

@Test(priority=15)
public void Group_Companies_SubMenu() {
	
	clickJS(locatorXpath("//li[@id='accordion-menu-item-13685']//a[text()='Group Companies']"));
	info("Submenu clicked");
	WaitUntilVisibleLocator("//h3[text()='Group Companies']");
	String ActualPageTitle=getText(locatorXpath("//h3[text()='Group Companies']"));
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Group Companies - Dot Com Infoway";
	String ExpectedPageTitle="Group Companies";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Group Companies Sub Menu Validated");
}


}
