package Home_Page_Menu;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Page_Footer_Menu extends Base_Class{

	
@BeforeMethod
	public void URL_Call() {
			driver.get("https://www.dotcominfoway.com/");
			info("URL Entered");
	}

@Test (priority=1)
public void Job_Enquiry_Apply_Here_Menu()  {
	click(locatorXpath("//a[text()='Apply Here']"));
	switchWindow();
	WaitUntilVisibleLocator("//h2[@class='vc_custom_heading align-left']");
	String ActualPageTitle=getText(locatorXpath("//h2[@class='vc_custom_heading align-left']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Job Application - Dot Com Infoway";
	String ExpectedPageTitle="Job Application";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Footer Job Application Menu Validated");
	switchWindow();
}


@Test (priority=2)
public void About_Us_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='About Us']"));
	String ActualPageTitle=getText(locatorXpath("//h2[text()='About Us']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="About Dot Com Infoway";
	String ExpectedPageTitle="About Us";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Footer About Us Menu Validated");
}

@Test (priority=3)
public void Careers_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Careers']"));
	String ActualPageTitle=getText(locatorXpath("//h2[text()='We are Hiring']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Career Opportunities, Job Vacancy in IT Company, Jobs in Madurai";
	String ExpectedPageTitle="We are Hiring";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Footer Careers Menu Validated");
}

@Test (priority=4)
public void Become_Our_Representative_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Become Our Representative']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Become Our Representative - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("Footer Become Our Representative Menu Validated");
}

@Test (priority=5)
public void Privacy_Policy_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Privacy Policy']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Dot Com Infoway - Privacy Policy";
	Assert(ActualTitle, ExpectedTitle);
	info("Footer Privacy Policy Menu Validated");
}


@Test (priority=6)
public void SiteMap_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Sitemap']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Sitemap - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
    info("Footer About Us Menu Validated");
}
}
