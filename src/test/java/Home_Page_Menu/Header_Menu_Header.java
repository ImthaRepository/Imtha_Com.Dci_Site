package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Header_Menu_Header extends Base_Class {

@BeforeMethod
  public void URL_Call() {
	driver.get("https://www.dotcominfoway.com/");
	info("URL Entered");
}

@Test(priority =1)
public void Logo() {
	click(locatorXpath("//img[@class='img-responsive standard-logo retina-logo']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="IT Services, IT Consulting & Digital Solutions Company - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("LOGO Validated");
}

@Test(priority =2)
public void Home_Menu() {
	click(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Home']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="IT Services, IT Consulting & Digital Solutions Company - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("Home Menu Validated");
}

@Test(priority =3)
public void About_Us_Menu() {
	click(locatorXpath("//ul[@id='menu-main-menu']//a[text()='About Us']"));
	String ActualPageTitle=getText(locatorXpath("//h2[text()='About Us']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="About Dot Com Infoway";
	String ExpectedPageTitle="About Us";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("About Us Menu Validated");
}

@Test(priority =4)
 public void Get_Quote_Menu() throws InterruptedException {
	click(locatorId("header-request-quote"));
	switchWindow();
	sleep(1000);
	String ActualPageTitle=getText(locatorXpath("//h2[@class='vc_custom_heading align-left']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Request For Services - Dot Com Infoway";
	String ExpectedPageTitle="Request For Services";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Get_Quote Menu Validated");
	switchWindow();


}

@Test(priority =5)
 public void Contact_Menu() {
	click(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Contact']"));
	String ActualPageTitle=getText(locatorXpath("//h2[@class='vc_custom_heading align-left']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Contact Us - Dot Com Infoway";
	String ExpectedPageTitle="Contact us";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Contact Menu Validated");
 }

@Test(priority =6)
public void Portfolio_Menu() {
	click(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Portfolio']"));
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="portfolio - Dot Com Infoway";
	String ExpectedPageURL="https://www.dotcominfoway.com/portfolio/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Portfolio Menu Validated");
}

@Test(priority =7)
public void Blog_Menu() {
	click(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Blog']"));
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Dot Com Infoway – Latest Technology, Web Development and SEO Blog, News, Updates and Tips";
	String ExpectedPageURL="https://www.dotcominfoway.com/blog/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Blog Menu Validated");
}

@Test(priority =8)
public void Contact_Telephone_Icon_Menu() throws InterruptedException {
	mouseOver(locatorXpath("//div[@class='call_menu_dci']"));
	String ActualSalesMail=getText(locatorXpath("//li[@class='envelope']//a"));
	String ActualTelephoneNum=getText(locatorXpath("//li[@class='flag1']//a"));
	String ExpectedSalesMail="ask@dotcominfoway.com";
	String ExpectedTelephoneNum="+91-452-2522257"; 
	String ActualJobMail=getText(locatorXpath("//li[@class='flag3']//a"));
	String ExpectedJobMail="hr.mdu@dci.in";
	Assert(ActualTelephoneNum, ExpectedTelephoneNum);
	Assert(ActualSalesMail, ExpectedSalesMail);
	Assert(ActualJobMail, ExpectedJobMail);
	
	clickJS(locatorXpath("(//a[text()='drop inquiry.'])[1]"));
	sleep(1500);
	switchWindow();
	String ActualURL1=getUrl();
	String ExpectURL1="https://www.dotcominfoway.com/contact/request-for-services/";
	Assert(ActualURL1, ExpectURL1);
	
	WaitUntilVisibleLocator("//div[@class='call_menu_dci']");
	mouseOver(locatorXpath("//div[@class='call_menu_dci']"));
	clickJS(locatorXpath("(//a[text()='drop inquiry.'])[2]"));
	sleep(1500);
	switchWindow();
	String ActualURL2=getUrl();
	String ExpectURL2="https://www.dotcominfoway.com/contact/job-application/";
	Assert(ActualURL2, ExpectURL2);
	info("Contact Telephone Icon Validated");
}




}